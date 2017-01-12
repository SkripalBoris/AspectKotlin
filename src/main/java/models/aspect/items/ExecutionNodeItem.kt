package models.aspect.items

import com.intellij.psi.PsiElement

/**
 * Created by sba on 06.01.17.
 */

class ExecutionNodeItem(var methodPattern: MethodPattern) : AspectItem() {

    override fun toString(): String {
        return "(execution($methodPattern))"
    }

    override fun calcExpression(psiElement: PsiElement): Boolean {
        return psiElement.getUserData(key) != null
    }
}