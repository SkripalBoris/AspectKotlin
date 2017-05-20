package models.aspect

import models.aspect.items.ArgumentModel
import models.boolExpr.BooleanExpression

/**
 * Created by boris on 08.05.17.
 */
class AroundAdvice(pointcutExpression: BooleanExpression,
                   adviceCode: String,
                   parameterList: List<ArgumentModel>,
                   pointcutList: List<Pointcut>) : Advice(pointcutExpression, adviceCode, parameterList, pointcutList) {
    override fun toString(): String {
        return "around() ${super.toString()}"
    }

    override fun wrapPointcut(pointcutStr: String): String {
        val generatedFun = this.getFunction()
        val body = "${generatedFun.second}\n${generatedFun.first}\n"
        this.targetIdentifier?.let {
            return "let{${this.targetIdentifier} -> $body}"
        }
        return "run{$body}"
    }
}