package parsers.visitors

import models.aspect.Aspect
import models.aspect.Pointcut
import models.aspect.items.ReferencePointcutNodeItem
import models.boolExpr.And
import models.boolExpr.BooleanExpression
import models.boolExpr.Not
import models.boolExpr.Or
import parsers.antlrParsers.AspectGrammarBaseVisitor
import parsers.antlrParsers.AspectGrammarParser


/**
 * Created by sba on 30.11.16.
 */
class AspectVisitor : AspectGrammarBaseVisitor<Aspect>() {

    override fun visitAspectDeclaration(ctx: AspectGrammarParser.AspectDeclarationContext): Aspect {
        val id = ctx.Identifier().text
        val pointcutVisitor = PointcutVisitor()
        pointcutVisitor.visit(ctx)

        val pointcutList = pointcutVisitor.pointcuts

        val adviceVisitor = AdviceVisitor(pointcutList)
        adviceVisitor.visit(ctx)


        val adviceList = adviceVisitor.advices

        pointcutList.forEach {
            addReferencePointcutKey(it.pointcutExpression, pointcutList)
        }

        adviceList.forEach {
            addReferencePointcutKey(it.pointcutExpression, pointcutList)
        }

        return Aspect(id, pointcutList, adviceList)
    }

    fun addReferencePointcutKey(item: BooleanExpression, pointcutList: List<Pointcut>) {
        when(item) {
            is And -> {
                addReferencePointcutKey(item.left, pointcutList)
                addReferencePointcutKey(item.right, pointcutList)
            }
            is Or -> {
                addReferencePointcutKey(item.left, pointcutList)
                addReferencePointcutKey(item.right, pointcutList)
            }
            is Not -> addReferencePointcutKey(item.child, pointcutList)
            is ReferencePointcutNodeItem -> pointcutList.forEach {
                if (it.id == item.identifier) {
                    item.referencePointcutKey = it.key
                    return
                }
            }
        }
    }
}