package parsers.visitors

import models.aspect.Advice
import models.aspect.Aspect
import models.aspect.pointcut.Pointcut
import models.boolExpr.*
import parsers.antlrParsers.AspectGrammarBaseVisitor
import parsers.antlrParsers.AspectGrammarParser



/**
 * Created by sba on 30.11.16.
 */
class AspectVisitor : AspectGrammarBaseVisitor<Aspect>() {
    var pointcutList :List<Pointcut>

    init {
        pointcutList = mutableListOf()
    }

    override fun visitAspectDeclaration(ctx: AspectGrammarParser.AspectDeclarationContext): Aspect {
        val id = ctx.Identifier().text
        val pointcutVisitor = PointcutVisitor()
        pointcutVisitor.visit(ctx)

        pointcutList = pointcutVisitor.pointcuts

        val adviceVisitor = AdviceVisitor()
        adviceVisitor.visit(ctx)

        return Aspect(id, pointcutList, adviceVisitor.advices)
    }

    inner class PointcutVisitor : AspectGrammarBaseVisitor<Pointcut>(){
        var pointcuts = mutableListOf<Pointcut>()

        override fun visitPointcut(ctx: AspectGrammarParser.PointcutContext): Pointcut {
            val boolExpr = buildExpression(ctx.pointcutExpression())

            println(boolExpr)
            pointcuts.add(Pointcut(ctx.id().text, boolExpr))
            return Pointcut("", NodeItem("", ""))
        }

        private fun buildExpression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext): BooleanExpression {
            return expression(pointcutExpression)
        }

        private fun expression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext): BooleanExpression {
            if(pointcutExpression.childCount == 1) {
                if (pointcutExpression.getChild(0).childCount == 2)
                    return NodeItem(pointcutExpression.getChild(0).text, null)
                else
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
                }
                else if (pointcutExpression.getChild(1).text == "&&") {
                    val and = And()

                    and.setLeftNode(expression(pointcutExpression.pointcutExpression(0)))
                    and.setRightNode(expression(pointcutExpression.pointcutExpression(1)))
                    return and
                }
            }
            throw IllegalArgumentException()
        }
    }

    inner class AdviceVisitor : AspectGrammarBaseVisitor<Advice>(){
        var advices = mutableListOf<Advice>()

        override fun visitAdvice(ctx: AspectGrammarParser.AdviceContext): Advice {
            val boolExpr = buildExpression(ctx.pointcutExpression())
            print(boolExpr)
            advices.add(Advice(ctx.adviceSpec().text, boolExpr, ctx.methodBody().block().text))

            return Advice("", NodeItem("", ""), "")
        }

        private fun buildExpression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext): BooleanExpression {
            return expression(pointcutExpression)
        }

        private fun expression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext): BooleanExpression {
            if(pointcutExpression.childCount == 1) {
                if (pointcutExpression.getChild(0).childCount == 2)
                    return NodeItem(pointcutExpression.getChild(0).getChild(0).text, null)
                return NodeItem(pointcutExpression.getChild(0).getChild(2).getChild(0).text, pointcutExpression.getChild(0).getChild(0).text)

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
                }
                else if (pointcutExpression.getChild(1).text == "&&") {
                    val and = And()
                    and.setLeftNode(expression(pointcutExpression.pointcutExpression(0)))
                    and.setRightNode(expression(pointcutExpression.pointcutExpression(1)))
                    return and
                }
            }
            throw IllegalArgumentException()
        }
    }
}