package parsers.visitors

import models.aspect.Advice
import models.aspect.Aspect
import models.aspect.Pointcut
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
        private var root: BooleanExpression? = null

        override fun visitPointcut(ctx: AspectGrammarParser.PointcutContext): Pointcut {
            this.root = null
            buildExpression(ctx.pointcutExpression())
            val boolExpr = root ?: throw IllegalStateException("Advice must have pointcutExpression")

            println(boolExpr)
            pointcuts.add(Pointcut(ctx.id().text, boolExpr))
            return Pointcut("", NodeItem("", ""))
        }

        private fun buildExpression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext) {
            expression(pointcutExpression)
        }

        private fun expression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext) {
            if(pointcutExpression.childCount == 1) {
                if (pointcutExpression.getChild(0).childCount == 2)
                    this.root = NodeItem(pointcutExpression.getChild(0).text, null)
                else
                    this.root = NodeItem(pointcutExpression.getChild(0).getChild(2).text, pointcutExpression.getChild(0).getChild(0).text)
                return
            }

            if (pointcutExpression.childCount == 2) {
                val not = Not()
                expression(pointcutExpression.pointcutExpression(0))
                not.setChild(this.root)
                this.root = not
                return
            }

            if (pointcutExpression.childCount == 3) {
                if (pointcutExpression.getChild(0).text == "(")
                    expression(pointcutExpression.pointcutExpression(0))
                else if (pointcutExpression.getChild(1).text == "||") {
                    val or = Or()
                    expression(pointcutExpression.pointcutExpression(0))
                    or.setLeftNode(this.root)
                    expression(pointcutExpression.pointcutExpression(1))
                    or.setRightNode(this.root)
                    this.root = or
                }
                else if (pointcutExpression.getChild(1).text == "&&") {
                    val and = And()
                    expression(pointcutExpression.pointcutExpression(0))
                    and.setLeftNode(this.root)
                    expression(pointcutExpression.pointcutExpression(1))
                    and.setRightNode(this.root)
                    this.root = and
                }
                return
            }
        }
    }

    inner class AdviceVisitor : AspectGrammarBaseVisitor<Advice>(){
        var advices = mutableListOf<Advice>()

        private var root: BooleanExpression? = null
        private var pointcutIdList: List<String>

        init {
            pointcutIdList = mutableListOf()
        }

        override fun visitAdvice(ctx: AspectGrammarParser.AdviceContext): Advice {
            this.root = null
            buildExpression(ctx.pointcutExpression())
            val boolExpr = root ?: throw IllegalStateException("Advice must have pointcutExpression")

            print(boolExpr)
            advices.add(Advice(ctx.adviceSpec().text, boolExpr))

            return Advice("", NodeItem("", ""))
        }

        private fun buildExpression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext) {
            expression(pointcutExpression)
        }

        private fun expression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext) {
            if(pointcutExpression.childCount == 1) {
                if (pointcutExpression.getChild(0).childCount == 2)
                    this.root = NodeItem(pointcutExpression.getChild(0).getChild(0).text, null)
                else
                    this.root = NodeItem(pointcutExpression.getChild(0).getChild(2).getChild(0).text, pointcutExpression.getChild(0).getChild(0).text)
                return
            }

            if (pointcutExpression.childCount == 2) {
                val not = Not()
                expression(pointcutExpression.pointcutExpression(0))
                not.setChild(this.root)
                this.root = not
                return
            }

            if (pointcutExpression.childCount == 3) {
                if (pointcutExpression.getChild(0).text == "(")
                    expression(pointcutExpression.pointcutExpression(0))
                else if (pointcutExpression.getChild(1).text == "||") {
                    val or = Or()
                    expression(pointcutExpression.pointcutExpression(0))
                    or.setLeftNode(this.root)
                    expression(pointcutExpression.pointcutExpression(1))
                    or.setRightNode(this.root)
                    this.root = or
                }
                else if (pointcutExpression.getChild(1).text == "&&") {
                    val and = And()
                    expression(pointcutExpression.pointcutExpression(0))
                    and.setLeftNode(this.root)
                    expression(pointcutExpression.pointcutExpression(1))
                    and.setRightNode(this.root)
                    this.root = and
                }
                return
            }
        }
    }
}