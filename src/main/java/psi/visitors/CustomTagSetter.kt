package psi.visitors

import models.aspect.items.CallNodeItem
import models.aspect.pointcut.Pointcut
import models.boolExpr.And
import models.boolExpr.BooleanExpression
import models.boolExpr.Not
import models.boolExpr.Or
import org.jetbrains.kotlin.psi.KtFile

/**
 * Created by sba on 07.01.17.
 */

object CustomTagSetter{
    fun visitFiles(pointcut: Pointcut, files: List<KtFile>) {
        files.forEach { visitFile(pointcut, it) }
    }

    fun visitFile(pointcut: Pointcut, file: KtFile) {
        visitBooleanExpression(pointcut.pointcutException, file)
    }

    fun visitBooleanExpression(node: BooleanExpression, file: KtFile) {
        // Если операнд, то переходим к его подвыражению
        if (node is Not) {
            visitBooleanExpression(node.getChild(), file)
            return
        }
        if (node is Or) {
            visitBooleanExpression(node.getLeftNode(), file)
            visitBooleanExpression(node.getRightNode(), file)
            return
        }
        if (node is And) {
            visitBooleanExpression(node.getLeftNode(), file)
            visitBooleanExpression(node.getRightNode(), file)
            return
        }

        // Если это элемент
        if (node is CallNodeItem)
            CallPsiTagSetter.visitFile(file, node)
    }
}