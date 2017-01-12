
package models.aspect.pointcut

import com.intellij.psi.PsiElement
import models.aspect.items.AspectItem
import models.boolExpr.BooleanExpression

/**
 * Created by sba on 29.11.16.
 */

class Pointcut(var id: String, var pointcutException: BooleanExpression): AspectItem() {
    override fun toString(): String {
        return "$id $pointcutException"
    }

    override fun calcExpression(psiElement: PsiElement): Boolean {
        return this.pointcutException.calcExpression(psiElement)
    }
}