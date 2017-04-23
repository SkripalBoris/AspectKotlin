package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.*
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtNullableType
import org.jetbrains.kotlin.psi.psiUtil.*
import org.jetbrains.kotlin.resolve.descriptorUtil.isExtension
import psi.TargetProjectContainer

/**
 * Created by sba on 08.01.17.
 */

object ExecutePsiTagSetter : FunctionTagSetter() {
    override fun setTag(psiElement: PsiElement, aspectItem: AspectItem) {
        psiElement.collectDescendantsOfType<KtNamedFunction>().forEach {
            if (checkFunction(it, aspectItem)) {
                if (it.bodyExpression != null)
                    it.bodyExpression!!.children.forEach { func ->
                        if (func is KtCallExpression)
                            if (func.getUserData(TargetProjectContainer.tagKey) == null)
                                func.putUserData(TargetProjectContainer.tagKey, mutableListOf(aspectItem.key))
                            else
                                func.getUserData(TargetProjectContainer.tagKey)!!.add(aspectItem.key)
                    }
            }
        }
    }

    override fun visitFile(file: KtFile, aspectItem: AspectItem) {
        if (aspectItem !is ExecutionNodeItem)
            throw IllegalArgumentException("Node item must be a ExecutionNodeItem")
        setTag(file, aspectItem)
        return
    }

    private fun checkFunction(psiElement: KtNamedFunction, aspectItem: AspectItem): Boolean {
        //psiElement.valueParameters[1].typeReference.typeElement.lastChild
        val functionPackage = if (psiElement.isExtensionDeclaration()) psiElement.receiverTypeReference!!.text
                              else if (psiElement.containingClassOrObject == null)
                                        ""
                                   else psiElement.containingClassOrObject!!.fqName.toString()
        val retType = if (psiElement.hasDeclaredReturnType()) psiElement.typeReference!!.text else "Unit"
        val realTypes = psiElement.valueParameters.map {
            val nullabilityType = if (it.text.last() == '?') NullabilityType.NULLABLE else NullabilityType.NOT_NULL
            val type = it.children.first().text
            MaybeNegativeParameter(type, false, nullabilityType)
        }
        if (aspectItem is ExecutionNodeItem) {
            // Проверяем соответствие имени и местоположения функции
            if (!(this.checkName(aspectItem.methodPattern.name, psiElement.name!!) &&
                    aspectItem.methodPattern.type.negative.xor(this.checkType(aspectItem.methodPattern.type, functionPackage)) &&
                    aspectItem.methodPattern.type.negative.xor(this.checkType(aspectItem.methodPattern.returnType!!, retType)) &&
                    this.checkValueParams(aspectItem.methodPattern.params, realTypes)))
                return false
            if (aspectItem.methodPattern.extensionModifier != ExtensionType.ANYTHING &&
                    psiElement.isExtensionDeclaration() &&
                    aspectItem.methodPattern.extensionModifier == ExtensionType.NOT_EXTENSION)
                return false

            if (aspectItem.methodPattern.inlineModifier != InlineType.ANYTHING &&
                    psiElement.modifierList != null && psiElement.modifierList!!.allChildren.all { it -> it.text == "inline" } &&
                    aspectItem.methodPattern.inlineModifier == InlineType.NOT_INLINE)
                return false
            // Проверка модификаторов
            aspectItem.methodPattern.modifiers.forEach {
                when (it.text) {
                    "public" -> {
                        if (psiElement.isPrivate())
                            return false
                    }

                    "private" -> {
                        if (!psiElement.isPrivate())
                            return false
                    }

                    "protected" -> {
                        if (!psiElement.isProtected())
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