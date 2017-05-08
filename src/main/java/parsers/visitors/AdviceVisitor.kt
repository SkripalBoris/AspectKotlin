package parsers.visitors

import models.aspect.*
import models.aspect.items.ArgumentModel
import models.aspect.items.ReferencePointcutNodeItem
import models.boolExpr.*
import org.antlr.v4.runtime.misc.Interval
import parsers.antlrParsers.AspectGrammarBaseVisitor
import parsers.antlrParsers.AspectGrammarParser

/**
 * Created by boris on 07.05.17.
 */
class AdviceVisitor(var pointcutList: List<Pointcut>) : AspectGrammarBaseVisitor<Advice>() {
    var advices = mutableListOf<Advice>()

    override fun visitAdvice(ctx: AspectGrammarParser.AdviceContext): Advice {
        val boolExpr = buildExpression(ctx.pointcutExpression())
        val adviceCode = ctx.start.inputStream.getText(Interval(ctx.methodBody().block().start.startIndex + 1,
                ctx.methodBody().block().stop.stopIndex - 1))
        val argumentsList = buildArgumentList(ctx)
        val advice = when (ctx.adviceSpec().children.first().text) {
            "before" -> BeforeAdvice(boolExpr, adviceCode, argumentsList)
            "after" -> AfterAdvice(boolExpr, adviceCode, argumentsList)
            "around" -> AroundAdvice(boolExpr, adviceCode, argumentsList)
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
        return listOf()
    }


    private fun buildExpression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext): BooleanExpression {
        return expression(pointcutExpression)
    }

    private fun expression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext): BooleanExpression {
        if (pointcutExpression.childCount == 1) {
            if (pointcutExpression.referencePointcut() != null) {
                pointcutList.forEach {
                    if (it.id == pointcutExpression.referencePointcut().id().text)
                        return ReferencePointcutNodeItem(it.key)
                }
            }
            if (pointcutExpression.getChild(0).childCount == 2)
                return NodeItem(pointcutExpression.getChild(0).getChild(0).text, null)
            return NodeItem(pointcutExpression.getChild(0).getChild(2).text, pointcutExpression.getChild(0).getChild(0).text)

        }

        if (pointcutExpression.childCount == 2) {
            val not = Not()
            not.setChild(expression(pointcutExpression.pointcutExpression(0)))
            return not
        }

        if (pointcutExpression.childCount == 3) {
            if (pointcutExpression.getChild(0).text == "(")
                return expression(pointcutExpression.pointcutExpression(0))
            else if (pointcutExpression.getChild(1).text == "||") {
                val or = Or()
                or.setLeftNode(expression(pointcutExpression.pointcutExpression(0)))
                or.setRightNode(expression(pointcutExpression.pointcutExpression(1)))
                return or
            } else if (pointcutExpression.getChild(1).text == "&&") {
                val and = And()
                and.setLeftNode(expression(pointcutExpression.pointcutExpression(0)))
                and.setRightNode(expression(pointcutExpression.pointcutExpression(1)))
                return and
            }
        }
        throw IllegalArgumentException()
    }
}