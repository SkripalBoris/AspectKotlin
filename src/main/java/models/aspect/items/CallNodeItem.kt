package models.aspect.items

import com.intellij.psi.PsiElement
import psi.TargetProjectContainer

/**
 * Created by sba on 05.01.17.
 */

class CallNodeItem(var methodPattern: MethodPattern) : AspectItem() {

    override fun toString(): String {
        return "(call($methodPattern))"
    }

    override fun calcExpression(psiElement: PsiElement): Boolean {
        val tags = psiElement.getUserData(TargetProjectContainer.tagKey)
        return  tags != null && this.key in tags
    }
}
