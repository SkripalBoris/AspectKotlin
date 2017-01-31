
package models.aspect.pointcut

import com.intellij.psi.PsiElement
import models.aspect.items.AspectItem
import models.boolExpr.BooleanExpression

/**
 * Created by sba on 29.11.16.
 */

class Pointcut(var id: String, var pointcutExpression: BooleanExpression): AspectItem() {
    override fun toString(): String {
        return "$id $pointcutExpression"
    }

    override fun calcExpression(psiElement: PsiElement): Boolean {
        return this.pointcutExpression.calcExpression(psiElement)
    }
}