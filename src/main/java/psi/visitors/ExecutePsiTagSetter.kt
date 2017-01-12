package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.AspectItem
import models.aspect.items.ExecutionNodeItem
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtFunction
import org.jetbrains.kotlin.psi.psiUtil.collectDescendantsOfType

/**
 * Created by sba on 08.01.17.
 */

object ExecutePsiTagSetter : PsiTagSetter {
    override fun setTag(psiElement: PsiElement, aspectItem: AspectItem) {
        psiElement.collectDescendantsOfType<KtFunction>().forEach {
            if (matchFunction(it, aspectItem)) {
                if (it.bodyExpression != null)
                    it.bodyExpression!!.children.forEach { func ->
                        if (func is KtCallExpression)
                            func.putUserData(aspectItem.key, aspectItem.toString())
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

    private fun matchFunction(psiElement: KtFunction, aspectItem: AspectItem): Boolean {
        if (aspectItem is ExecutionNodeItem) {
            if (aspectItem.methodPattern.name == psiElement.name) {
                return true
            }
        }
        return false
    }
}