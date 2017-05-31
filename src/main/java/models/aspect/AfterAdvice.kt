package models.aspect

import models.aspect.items.ArgumentModel
import models.boolExpr.BooleanExpression
import java.security.SecureRandom

/**
 * Created by boris on 08.05.17.
 */
class AfterAdvice(pointcutExpression: BooleanExpression,
                  adviceCode: String,
                  parameterList: List<ArgumentModel>,
                  pointcutList: List<Pointcut>): Advice(pointcutExpression, adviceCode, parameterList, pointcutList) {
    override fun toString() = "after() ${super.toString()}"

    override fun wrapPointcut(pointcutStr: String): String {
        val generatedFun = getFunction()
        val variableId = "____a${SecureRandom().nextInt(Int.MAX_VALUE)}"
        targetIdentifier?.let {
            return "let{$it -> ${generatedFun.second}\nval $variableId = $it.$pointcutStr\n${generatedFun.first}\n$variableId}"
        }
        return "run{${generatedFun.second}\nval $variableId = $pointcutStr\n${generatedFun.first}\n$variableId}"
    }
}