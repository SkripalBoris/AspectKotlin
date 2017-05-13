package parsers.visitors

import models.aspect.Pointcut
import parsers.antlrParsers.AspectGrammarBaseVisitor
import parsers.antlrParsers.AspectGrammarParser

/**
 * Created by boris on 07.05.17.
 */
class PointcutVisitor : AspectGrammarBaseVisitor<Pointcut>() {
    val pointcuts = mutableListOf<Pointcut>()

    override fun visitPointcut(ctx: AspectGrammarParser.PointcutContext): Pointcut {
        val boolExpr = buildPointcutExpression(ctx.pointcutExpression(), ctx.formalParameters().formalParameterList())
        val pointcut = Pointcut(ctx.id().text, boolExpr)
        pointcuts.add(pointcut)
        return pointcut
    }
}