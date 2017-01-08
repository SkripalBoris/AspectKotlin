package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.AspectItem
import models.aspect.items.CallNodeItem
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtNameReferenceExpression

/**
 * Created by sba on 07.01.17.
 */

object CallPsiTagSetter: PsiTagSetter {
    override fun setTag(psiElement: PsiElement, aspectItem: AspectItem) {
        if (psiElement is KtCallExpression)
            if (matchFunction(psiElement, aspectItem))
                psiElement.putUserData(aspectItem.key, aspectItem.toString())
        psiElement.children.forEach { setTag(it, aspectItem) }
    }

    override fun visitFile(file: KtFile, aspectItem: AspectItem) {
        if (aspectItem !is CallNodeItem)
            throw IllegalArgumentException("Node item must be a CallNodeItem")
        setTag(file, aspectItem)
        return
    }

    private fun matchFunction(psiElement: KtCallExpression, aspectItem: AspectItem): Boolean {
        val funName = (psiElement.calleeExpression as KtNameReferenceExpression).getReferencedName()
        if (aspectItem is CallNodeItem) {
            if (aspectItem.methodPattern.name == funName) {
                return true
            }
        }
        return false
    }
}