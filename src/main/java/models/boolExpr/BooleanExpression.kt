package models.boolExpr

import com.intellij.psi.PsiElement


/**
 * Created by sba on 06.12.16.
 */

interface BooleanExpression {
    fun calcExpression(psiElement: PsiElement): Boolean
}

class Or(val left: BooleanExpression, val right: BooleanExpression) : BooleanExpression {
    override fun toString() = "($left || $right)"

    override fun calcExpression(psiElement: PsiElement) =
            left.calcExpression(psiElement) || right.calcExpression(psiElement)
}

class And(val left: BooleanExpression, val right: BooleanExpression) : BooleanExpression {
    override fun toString() = "($left && $right)"

    override fun calcExpression(psiElement: PsiElement) =
            left.calcExpression(psiElement) && right.calcExpression(psiElement)
}

class Not(val child: BooleanExpression) : BooleanExpression {
    override fun toString() =
            "!($child)"

    override fun calcExpression(psiElement: PsiElement) =
            !this.child.calcExpression(psiElement)
}