package models.aspect.items

import com.intellij.psi.PsiElement
import psi.TargetProjectContainer

/**
 * Created by sba on 05.01.17.
 */

class CallNodeItem(val methodPattern: MethodPattern) : AspectItem() {

    override fun toString() = "(call($methodPattern))"

    override fun calcExpression(psiElement: PsiElement) =
            psiElement.getUserData(TargetProjectContainer.tagKey)?.let { tags -> key in tags } ?: false
}
