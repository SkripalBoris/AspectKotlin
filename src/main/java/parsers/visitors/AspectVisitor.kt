package parsers.visitors

import models.aspect.Aspect
import models.aspect.pointcut.Pointcut
import parsers.antlrParsers.AspectGrammarBaseVisitor
import parsers.antlrParsers.AspectGrammarParser


/**
 * Created by sba on 30.11.16.
 */
class AspectVisitor : AspectGrammarBaseVisitor<Aspect>() {
    var pointcutList: List<Pointcut>

    init {
        pointcutList = mutableListOf()
    }

    override fun visitAspectDeclaration(ctx: AspectGrammarParser.AspectDeclarationContext): Aspect {
        val id = ctx.Identifier().text
        val pointcutVisitor = PointcutVisitor()
        pointcutVisitor.visit(ctx)

        pointcutList = pointcutVisitor.pointcuts

        val adviceVisitor = AdviceVisitor(pointcutList = pointcutList)
        adviceVisitor.visit(ctx)

        return Aspect(id, pointcutList, adviceVisitor.advices)
    }
}