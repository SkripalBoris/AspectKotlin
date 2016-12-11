package parsers.visitors

import models.aspect.Advice
import models.aspect.Aspect
import models.aspect.Pointcut
import models.boolExpr.*
import org.jetbrains.annotations.NotNull
import parsers.antlrParsers.AspectGrammarBaseListener
import parsers.antlrParsers.AspectGrammarBaseVisitor
import parsers.antlrParsers.AspectGrammarLexer
import parsers.antlrParsers.AspectGrammarParser



/**
 * Created by sba on 30.11.16.
 */
class AspectVisitor : AspectGrammarBaseVisitor<Aspect>() {
    override fun visitAspectDeclaration(@NotNull ctx: AspectGrammarParser.AspectDeclarationContext): Aspect {
        val id = ctx.Identifier().text
        val pointcutVisitor = PointcutVisitor()
        pointcutVisitor.visit(ctx)
        val adviceVisitor = AdviceVisitor()
        adviceVisitor.visit(ctx)

        return Aspect(id, pointcutVisitor.pointcuts, adviceVisitor.advices)
    }

    private class PointcutVisitor : AspectGrammarBaseVisitor<Pointcut>(){
        var pointcuts = mutableListOf<Pointcut>()
        override fun visitPointcut(ctx: AspectGrammarParser.PointcutContext): Pointcut {
            pointcuts.add(Pointcut(ctx.id().text))
            return Pointcut("")
        }
    }

    private class AdviceVisitor : AspectGrammarBaseVisitor<Advice>(){
        var advices = mutableListOf<Advice>()

        private var root: BooleanExpression? = null

        override fun visitAdvice(ctx: AspectGrammarParser.AdviceContext): Advice {
            advices.add(Advice(ctx.adviceSpec().text))

            this.root = null

            buildExpression(ctx.pointcutExpression())

            return Advice("")
        }

        private fun buildExpression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext) {
            expression(pointcutExpression)
        }

        private fun expression(pointcutExpression: AspectGrammarParser.PointcutExpressionContext) {
            if(pointcutExpression.childCount == 1) {
                this.root = NodeItem(pointcutExpression.getChild(0).text)
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