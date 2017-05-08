package models.aspect

import models.boolExpr.BooleanExpression

/**
 * Created by boris on 08.05.17.
 */

class BeforeAdvice(pointcutExpression: BooleanExpression, adviceCode: String): Advice(pointcutExpression, adviceCode) {
    override fun toString(): String {
        return "before() ${super.toString()}"
    }

    override fun wrapPointcut(pointcutStr: String): String {
        return "run{${this.getFunction()}\n${this.functionName}()\n$pointcutStr}"
    }
}