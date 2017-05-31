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
    override fun toString() = "around() ${super.toString()}"

    override fun wrapPointcut(pointcutStr: String): String {
        val generatedFun = getFunction()
        val body = "${generatedFun.second}\n${generatedFun.first}\n"
        targetIdentifier?.let {
            return "let{$it -> $body}"
        }
        return "run{$body}"
    }
}