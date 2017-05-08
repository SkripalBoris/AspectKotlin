package models.aspect

import models.boolExpr.BooleanExpression

/**
 * Created by boris on 08.05.17.
 */
class AfterAdvice(pointcutExpression: BooleanExpression, adviceCode: String): Advice(pointcutExpression, adviceCode) {
    override fun toString(): String {
        return "after() ${super.toString()}"
    }

    override fun wrapPointcut(pointcutStr: String): String {
        return "run{${this.getFunction()}\nval ____a = $pointcutStr\n${this.functionName}()\n____a}"
    }
}