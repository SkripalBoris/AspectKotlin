package parsers.visitors

import models.aspect.*
import models.aspect.items.ArgumentModel
import models.aspect.items.ReferencePointcutNodeItem
import org.antlr.v4.runtime.misc.Interval
import parsers.antlrParsers.AspectGrammarBaseVisitor
import parsers.antlrParsers.AspectGrammarParser
import java.security.SecureRandom

/**
 * Created by boris on 07.05.17.
 */
class AdviceVisitor(val pointcutList: MutableList<Pointcut>) : AspectGrammarBaseVisitor<Advice>() {
    val advices = mutableListOf<Advice>()

    override fun visitAdvice(ctx: AspectGrammarParser.AdviceContext): Advice {
        val boolExpr = buildPointcutExpression(ctx.pointcutExpression(), ctx.adviceSpec().formalParameters().formalParameterList())
        val bufPointcutName = "advicePointcut${SecureRandom().nextInt(Int.MAX_VALUE)}"

        pointcutList.add(Pointcut(bufPointcutName, boolExpr))

        val newBoolExpr = ReferencePointcutNodeItem(bufPointcutName, 0)

        val adviceCode = ctx.start.inputStream.getText(Interval(ctx.methodBody().block().start.startIndex + 1,
                ctx.methodBody().block().stop.stopIndex - 1))
        val argumentsList = buildArgumentList(ctx)
        val advice = when (ctx.adviceSpec().children.first().text) {
            "before" -> BeforeAdvice(newBoolExpr, adviceCode, argumentsList, pointcutList)
            "after" -> AfterAdvice(newBoolExpr, adviceCode, argumentsList, pointcutList)
            "around" -> AroundAdvice(newBoolExpr, adviceCode, argumentsList, pointcutList)
            else -> throw NotImplementedError()
        }
        advices.add(advice)
        return advice
    }

    private fun buildArgumentList(ctx: AspectGrammarParser.AdviceContext): List<ArgumentModel> {
        ctx.adviceSpec().formalParameters().formalParameterList()?.let { paramList ->
            return paramList.formalParameter().map {
                param -> ArgumentModel(buildType(param.typeType()), param.variableDeclaratorId().Identifier().text)
            }
        }
        return emptyList()
    }
}