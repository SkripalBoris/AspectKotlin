package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.AspectItem
import models.aspect.items.ExecutionNodeItem
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtFunction
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.psiUtil.collectDescendantsOfType
import org.jetbrains.kotlin.psi.psiUtil.containingClassOrObject
import psi.TargetProjectContainer

/**
 * Created by sba on 08.01.17.
 */

object ExecutePsiTagSetter : PsiTagSetter {
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

    private fun checkFunction(psiElement: KtFunction, aspectItem: AspectItem): Boolean {
        if (aspectItem is ExecutionNodeItem) {
            if (!psiElement.name!!.matches(aspectItem.methodPattern.name.replace("*", ".*").toRegex()))
                return false
            if (!aspectItem.methodPattern.type.isEmpty() && ( psiElement.containingClassOrObject == null ||
                    !psiElement.containingClassOrObject!!.fqName.toString().matches(
                            aspectItem.methodPattern.type.replace(".", "\\.").replace("*", ".*").toRegex())))
                return false
            return true
        }
        return false
    }
}