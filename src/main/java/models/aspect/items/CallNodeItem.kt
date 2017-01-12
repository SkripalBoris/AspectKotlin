package models.aspect.items

import com.intellij.psi.PsiElement

/**
 * Created by sba on 05.01.17.
 */

class CallNodeItem(var methodPattern: MethodPattern) : AspectItem() {

    override fun toString(): String {
        return "(call($methodPattern))"
    }

    override fun calcExpression(psiElement: PsiElement): Boolean {
        return psiElement.getUserData(key) != null
    }
}
