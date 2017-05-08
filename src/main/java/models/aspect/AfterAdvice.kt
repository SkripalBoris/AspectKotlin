package models.aspect

import models.aspect.items.ArgumentModel
import models.boolExpr.BooleanExpression

/**
 * Created by boris on 08.05.17.
 */
class AfterAdvice(pointcutExpression: BooleanExpression,
                  adviceCode: String,
                  parameterList: List<ArgumentModel>): Advice(pointcutExpression, adviceCode, parameterList) {
    override fun toString(): String {
        return "after() ${super.toString()}"
    }

    override fun wrapPointcut(pointcutStr: String, targetIdentifier: String): String {
        val generatedFun = this.getFunction()
        return "run{${generatedFun.second}\nval ____a = $pointcutStr\n${generatedFun.first}\n____a}"
    }
}