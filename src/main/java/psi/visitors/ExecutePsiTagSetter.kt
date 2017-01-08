package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.AspectItem
import models.aspect.items.ExecutionNodeItem
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtFunction

/**
 * Created by sba on 08.01.17.
 */

object ExecutePsiTagSetter: PsiTagSetter {
    override fun setTag(psiElement: PsiElement, aspectItem: AspectItem) {
        if (psiElement is KtFunction && matchFunction(psiElement, aspectItem)) {

            if (psiElement.bodyExpression != null)
                psiElement.bodyExpression!!.children.forEach {
                    if (it is KtCallExpression)
                        it.putUserData(aspectItem.key, aspectItem.toString())
                }
        }
        psiElement.children.forEach { setTag(it, aspectItem) }
    }

    override fun visitFile(file: KtFile, aspectItem: AspectItem) {
        if (aspectItem !is ExecutionNodeItem)
            throw IllegalArgumentException("Node item must be a ExecutionNodeItem")
        setTag(file, aspectItem)
        return
    }

    private fun matchFunction(psiElement: KtFunction, aspectItem: AspectItem): Boolean {
        if (aspectItem is ExecutionNodeItem) {
            if (aspectItem.methodPattern.name == psiElement.name) {
                return true
            }
        }
        return false
    }
}