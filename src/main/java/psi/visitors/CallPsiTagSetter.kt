package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.*
import org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.psiUtil.collectDescendantsOfType
import org.jetbrains.kotlin.resolve.calls.callUtil.getResolvedCall
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.descriptorUtil.isExtension
import psi.TargetProjectContainer

/**
 * Created by sba on 07.01.17.
 */

object CallPsiTagSetter : BaseTagSetter() {
    override fun setTag(psiElement: PsiElement, aspectItem: AspectItem) {
        psiElement.collectDescendantsOfType<KtCallExpression>().forEach {
            if (checkFunction(it, aspectItem as CallNodeItem))
                if (it.getUserData(TargetProjectContainer.tagKey) == null)
                    it.putUserData(TargetProjectContainer.tagKey, mutableListOf(aspectItem.key))
                else
                    it.getUserData(TargetProjectContainer.tagKey)?.add(aspectItem.key)
        }
    }

    override fun visitFile(file: KtFile, aspectItem: AspectItem) {
        if (aspectItem !is CallNodeItem)
            throw IllegalArgumentException("Node item must be a CallNodeItem")
        setTag(file, aspectItem)
    }

    private fun checkFunction(psiElement: KtCallExpression, aspectItem: CallNodeItem): Boolean {
        val resolvedCall = psiElement.getResolvedCall(TargetProjectContainer.context!!) ?: return false
        val resolvedFunDescriptor = resolvedCall.candidateDescriptor
        val funPackage = if (resolvedFunDescriptor.isExtension) run {
            val extensionReceiver = resolvedFunDescriptor.extensionReceiverParameter ?: return false
            buildParameterModel(extensionReceiver.value.type)
        }
        else ParameterModel(resolvedFunDescriptor.containingDeclaration.fqNameSafe.asString())
        val funName = NegativeNameModel(resolvedFunDescriptor.name.asString())
        val realParams = resolvedFunDescriptor.valueParameters.map {
            buildParameterModel(it.type)
        }

        val returnType = buildParameterModel(resolvedFunDescriptor.returnType)

        if (!(this.checkName(aspectItem.methodPattern.name, funName) &&
                aspectItem.methodPattern.type.negative.xor(this.checkType(aspectItem.methodPattern.type, funPackage)) &&
                aspectItem.methodPattern.type.negative.xor(this.checkType(aspectItem.methodPattern.returnType, returnType) &&
                        this.checkValueParams(aspectItem.methodPattern.params, realParams))))
            return false
        if (aspectItem.methodPattern.extensionModifier != ExtensionType.ANYTHING &&
                resolvedFunDescriptor.isExtension &&
                aspectItem.methodPattern.extensionModifier == ExtensionType.NOT_EXTENSION)
            return false

        aspectItem.methodPattern.modifiers.forEach {
            when (it.name) {
                "public" -> {
                    if (it.negative.xor(resolvedFunDescriptor.visibility.name != "public"))
                        return false
                }

                "private" -> {
                    if (it.negative.xor(resolvedFunDescriptor.visibility.name != "private" ||
                            resolvedFunDescriptor.visibility.name != "protected"))
                        return false
                }

                "protected" -> {
                    if (it.negative.xor(resolvedFunDescriptor.visibility.name != "protected"))
                        return false
                }

                "inline" -> {
                    if (!it.negative.xor((resolvedFunDescriptor as SimpleFunctionDescriptorImpl).isInline))
                        return false
                }

                else -> throw IllegalArgumentException("Unexpected modifier ${it.name}")
            }
        }
        return true
    }
}