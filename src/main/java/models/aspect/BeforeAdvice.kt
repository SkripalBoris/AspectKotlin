package models.aspect

import models.aspect.items.ArgumentModel
import models.boolExpr.BooleanExpression

/**
 * Created by boris on 08.05.17.
 */

class BeforeAdvice(pointcutExpression: BooleanExpression,
                   adviceCode: String,
                   parameterList: List<ArgumentModel>): Advice(pointcutExpression, adviceCode, parameterList) {
    override fun toString(): String {
        return "before() ${super.toString()}"
    }

    override fun wrapPointcut(pointcutStr: String, targetIdentifier: String): String {
        val generatedFun = this.getFunction()
        return "run{${generatedFun.second}\n${generatedFun.first}\n$pointcutStr}"
    }
}