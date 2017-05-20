package models.aspect

import models.aspect.items.ArgumentModel
import models.boolExpr.BooleanExpression

/**
 * Created by boris on 08.05.17.
 */

class BeforeAdvice(pointcutExpression: BooleanExpression,
                   adviceCode: String,
                   parameterList: List<ArgumentModel>,
                   pointcutList: List<Pointcut>): Advice(pointcutExpression, adviceCode, parameterList, pointcutList) {
    override fun toString(): String {
        return "before() ${super.toString()}"
    }

    override fun wrapPointcut(pointcutStr: String): String {
        val generatedFun = this.getFunction()
        this.targetIdentifier?.let {
            return "let{${this.targetIdentifier} -> ${generatedFun.second}\n${generatedFun.first}\n${this.targetIdentifier}.$pointcutStr}"
        }
        return "run{${generatedFun.second}\n${generatedFun.first}\n$pointcutStr}"
    }
}