package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.AspectItem
import models.aspect.items.ExecutionNodeItem
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.psiUtil.collectDescendantsOfType
import org.jetbrains.kotlin.psi.psiUtil.containingClassOrObject
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
        val functionPackage = if (psiElement.containingClassOrObject == null) "" else psiElement.containingClassOrObject!!.fqName.toString()
        val retType = if (psiElement.hasDeclaredReturnType()) psiElement.typeReference!!.text else "Unit"
        if (aspectItem is ExecutionNodeItem) {
            return this.checkName(aspectItem.methodPattern.name, psiElement.name!!) &&
                    this.checkType(aspectItem.methodPattern.type, functionPackage) &&
                    this.checkType(aspectItem.methodPattern.returnType!!, retType)
        }
        throw IllegalArgumentException("Illegal aspectItem")
    }
}