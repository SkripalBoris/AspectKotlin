package models.aspect

import com.intellij.psi.PsiElement
import models.aspect.items.ArgumentModel
import models.aspect.items.AspectItem
import models.boolExpr.BooleanExpression
import java.security.SecureRandom

/**
 * Created by sba on 30.11.16.
 */

open class Advice(var pointcutExpression: BooleanExpression, var adviceCode: String, var parameterList: List<ArgumentModel>) : AspectItem() {

    override fun toString(): String {
        val paramStr = parameterList.fold("") { total, next -> if (total.isEmpty()) next.toString() else "$total, $next" }
        return "($paramStr): $pointcutExpression {\n$adviceCode\n}"
    }

    override fun calcExpression(psiElement: PsiElement): Boolean {
        return this.pointcutExpression.calcExpression(psiElement)
    }

    fun getFunction(): Pair<String, String> {
        val functionName: String = "adviceFun${SecureRandom().nextInt(Int.MAX_VALUE)}"
        return Pair("$functionName()", "fun $functionName(){\n$adviceCode}\n")
    }

    open fun wrapPointcut(pointcutStr: String, targetIdentifier: String): String {
        throw NotImplementedError()
    }
}