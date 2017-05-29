package models.boolExpr

import com.intellij.psi.PsiElement


/**
 * Created by sba on 06.12.16.
 */

/*
Абстрактные классы
 */
interface BooleanExpression {
    fun calcExpression(psiElement: PsiElement): Boolean
}

/*
Реализации
 */

class Or(val left: BooleanExpression, val right: BooleanExpression) : BooleanExpression {
    override fun toString() = String.format("($left || $right)")

    override fun calcExpression(psiElement: PsiElement): Boolean = left.calcExpression(psiElement) || right.calcExpression(psiElement)
}

class And(val left: BooleanExpression, val right: BooleanExpression) : BooleanExpression {
    override fun toString() = String.format("($left && $right)")

    override fun calcExpression(psiElement: PsiElement): Boolean = left.calcExpression(psiElement) && right.calcExpression(psiElement)
}

class Not(val child: BooleanExpression) : BooleanExpression {
    override fun toString() = String.format("!($child)")

    override fun calcExpression(psiElement: PsiElement): Boolean = !child.calcExpression(psiElement)
}