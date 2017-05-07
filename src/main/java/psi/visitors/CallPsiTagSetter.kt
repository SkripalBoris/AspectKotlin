package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.*
import org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtNullableType
import org.jetbrains.kotlin.psi.psiUtil.collectDescendantsOfType
import org.jetbrains.kotlin.resolve.calls.callUtil.getResolvedCall
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.descriptorUtil.isExtension
import org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor
import psi.TargetProjectContainer

/**
 * Created by sba on 07.01.17.
 */

object CallPsiTagSetter : FunctionTagSetter() {
    override fun setTag(psiElement: PsiElement, aspectItem: AspectItem) {
        psiElement.collectDescendantsOfType<KtCallExpression>().forEach {
            if (checkFunction(it, aspectItem))
                if (it.getUserData(TargetProjectContainer.tagKey) == null)
                    it.putUserData(TargetProjectContainer.tagKey, mutableListOf(aspectItem.key))
                else
                    it.getUserData(TargetProjectContainer.tagKey)!!.add(aspectItem.key)
        }
    }

    override fun visitFile(file: KtFile, aspectItem: AspectItem) {
        if (aspectItem !is CallNodeItem)
            throw IllegalArgumentException("Node item must be a CallNodeItem")
        setTag(file, aspectItem)
        return
    }

    private fun checkFunction(psiElement: KtCallExpression, aspectItem: AspectItem): Boolean {
        val resolvedFunDescriptor = psiElement.getResolvedCall(TargetProjectContainer.context!!)!!.candidateDescriptor
        val funName = resolvedFunDescriptor.name.asString()
        val funPackage = if (resolvedFunDescriptor.isExtension) resolvedFunDescriptor.extensionReceiverParameter!!.value.type.toString() else resolvedFunDescriptor.containingDeclaration.fqNameSafe.asString()
        val realParams = resolvedFunDescriptor.valueParameters.map {
            val typeName = it.type.constructor.toString()
            val nullableModifier = if (it.type.isMarkedNullable) NullabilityType.NULLABLE else NullabilityType.NOT_NULL
            ParameterModel(typeName, nullableModifier = nullableModifier)
        }

        if (aspectItem is CallNodeItem) {
            if (!(this.checkName(aspectItem.methodPattern.name, funName) &&
                    aspectItem.methodPattern.type.negative.xor(this.checkType(aspectItem.methodPattern.type, funPackage)) &&
                            aspectItem.methodPattern.type.negative.xor(this.checkType(aspectItem.methodPattern.returnType, resolvedFunDescriptor.returnType.toString())) &&
                    this.checkValueParams(aspectItem.methodPattern.params, realParams)))
                return false
            if (aspectItem.methodPattern.extensionModifier != ExtensionType.ANYTHING &&
                    resolvedFunDescriptor.isExtension &&
                    aspectItem.methodPattern.extensionModifier == ExtensionType.NOT_EXTENSION)
                return false
            if (aspectItem.methodPattern.inlineModifier != InlineType.ANYTHING &&
                    (resolvedFunDescriptor as SimpleFunctionDescriptorImpl).isInline &&
                    aspectItem.methodPattern.inlineModifier == InlineType.NOT_INLINE)
                return false

            aspectItem.methodPattern.modifiers.forEach {
                when (it.typeName) {
                    "public" -> {
                        if (resolvedFunDescriptor.visibility.name != "public")
                            return false
                    }

                    "private" -> {
                        if (resolvedFunDescriptor.visibility.name != "private" ||
                                resolvedFunDescriptor.visibility.name != "protected")
                            return false
                    }

                    "protected" -> {
                        if (resolvedFunDescriptor.visibility.name != "protected")
                            return false
                    }

                    else -> throw IllegalArgumentException("Unexpected modifier")
                }
            }
            return true
        }
        throw IllegalArgumentException("Illegal aspectItem")
    }
}