package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.*
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.psiUtil.*
import psi.TargetProjectContainer

/**
 * Created by sba on 08.01.17.
 */

object ExecutePsiTagSetter : BaseTagSetter() {
    override fun setTag(psiElement: PsiElement, aspectItem: AspectItem) {
        psiElement.collectDescendantsOfType<KtNamedFunction>().forEach {
            if (checkFunction(it, aspectItem as ExecutionNodeItem)) {
                it.bodyExpression?.let { bodyExpr ->
                    bodyExpr.collectDescendantsOfType<KtCallExpression>().forEach { func ->
                        if (func.getUserData(TargetProjectContainer.tagKey) == null)
                            func.putUserData(TargetProjectContainer.tagKey, mutableListOf(aspectItem.key))
                        else
                            func.getUserData(TargetProjectContainer.tagKey)?.add(aspectItem.key)
                    }
                }
            }
        }
    }

    override fun visitFile(file: KtFile, aspectItem: AspectItem) {
        if (aspectItem !is ExecutionNodeItem)
            throw IllegalArgumentException("Node item must be a ExecutionNodeItem")
        setTag(file, aspectItem)
    }

    private fun checkFunction(psiElement: KtNamedFunction, aspectItem: ExecutionNodeItem): Boolean {
        val functionPackage = if (psiElement.isExtensionDeclaration()) {
            buildParameterModel(psiElement.receiverTypeReference)
        } else {
            buildParameterModel(psiElement.containingClassOrObject)
        }

        val retType = buildParameterModel(psiElement.typeReference)

        val realTypes = psiElement.valueParameters.map {
            val nullabilityType = if (it.text.last() == '?') NullabilityType.NULLABLE else NullabilityType.NOT_NULL
            val type = it.children.first().text
            ParameterModel(type, nullableModifier = nullabilityType)
        }

        // Не поддерживаем безымянные методы
        if (psiElement.name == null)
            return false
        val functionName = NegativeNameModel(psiElement.name.toString())
        // Проверяем соответствие имени и местоположения функции
        if (!(this.checkName(aspectItem.methodPattern.name, functionName) &&
                aspectItem.methodPattern.type.negative.xor(this.checkType(aspectItem.methodPattern.type, functionPackage)) &&
                aspectItem.methodPattern.type.negative.xor(this.checkType(aspectItem.methodPattern.returnType, retType)) &&
                this.checkValueParams(aspectItem.methodPattern.params, realTypes)))
            return false
        if (aspectItem.methodPattern.extensionModifier != ExtensionType.ANYTHING &&
                psiElement.isExtensionDeclaration() &&
                aspectItem.methodPattern.extensionModifier == ExtensionType.NOT_EXTENSION)
            return false

        if (aspectItem.methodPattern.inlineModifier != InlineType.ANYTHING &&
                psiElement.modifierList != null && psiElement.modifierList!!.allChildren.any { it -> it.text == "inline" } &&
                aspectItem.methodPattern.inlineModifier == InlineType.NOT_INLINE)
            return false
        // Проверка модификаторов
        aspectItem.methodPattern.modifiers.forEach {
            when (it.name) {
                "public" -> {
                    if (it.negative.xor(psiElement.isPrivate()))
                        return false
                }

                "private" -> {
                    if (it.negative.xor(!psiElement.isPrivate()))
                        return false
                }

                "protected" -> {
                    if (it.negative.xor(!psiElement.isProtected()))
                        return false
                }

                else -> throw IllegalArgumentException("Unexpected modifier")
            }
        }
        return true
    }
}