package models.aspect.items

import com.intellij.psi.PsiElement
import psi.TargetProjectContainer

/**
 * Created by sba on 06.01.17.
 */

class ExecutionNodeItem(val methodPattern: MethodPattern) : AspectItem() {

    override fun toString(): String = "(execution($methodPattern))"

    override fun calcExpression(psiElement: PsiElement): Boolean =
            psiElement.getUserData(TargetProjectContainer.tagKey)?.let { tags -> key in tags } ?: false
}