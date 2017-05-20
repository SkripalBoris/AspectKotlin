package models.aspect

import models.aspect.items.ArgumentModel
import models.boolExpr.BooleanExpression

/**
 * Created by boris on 08.05.17.
 */
class AfterAdvice(pointcutExpression: BooleanExpression,
                  adviceCode: String,
                  parameterList: List<ArgumentModel>,
                  pointcutList: List<Pointcut>): Advice(pointcutExpression, adviceCode, parameterList, pointcutList) {
    override fun toString(): String {
        return "after() ${super.toString()}"
    }

    override fun wrapPointcut(pointcutStr: String): String {
        val generatedFun = this.getFunction()
        this.targetIdentifier?.let {
            return "let{${this.targetIdentifier} -> ${generatedFun.second}\nval ____a = ${this.targetIdentifier}.$pointcutStr\n${generatedFun.first}\n____a}"
        }
        return "run{${generatedFun.second}\nval ____a = $pointcutStr\n${generatedFun.first}\n____a}"
    }
}