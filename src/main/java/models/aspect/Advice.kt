package models.aspect

import com.intellij.psi.PsiElement
import models.aspect.items.AspectItem
import models.boolExpr.BooleanExpression

/**
 * Created by sba on 30.11.16.
 */

class Advice(var adviceInsertPlace: String, var pointcutExpression: BooleanExpression, var adviceCode: String) : AspectItem() {
    override fun toString(): String {
        return "$adviceInsertPlace $pointcutExpression {\n${adviceCode}\n}"
    }

    override fun calcExpression(psiElement: PsiElement): Boolean {
        return this.pointcutExpression.calcExpression(psiElement)
    }
}