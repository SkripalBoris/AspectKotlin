package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.CallNodeItem
import models.aspect.items.ExecutionNodeItem
import models.aspect.items.TargetNodeItem
import models.aspect.Pointcut
import models.boolExpr.And
import models.boolExpr.BooleanExpression
import models.boolExpr.Not
import models.boolExpr.Or
import org.jetbrains.kotlin.psi.KtFile
import psi.TargetProjectContainer

/**
 * Created by sba on 07.01.17.
 */

object PointcutTagSetter {
    fun visitFiles(pointcut: Pointcut, files: List<KtFile>) {
        files.forEach { visitFile(pointcut, it) }
    }

    private fun visitFile(pointcut: Pointcut, file: KtFile) {
        visitBooleanExpression(pointcut.pointcutExpression, file)
        recursiveSetPointcutTag(file, pointcut)
    }

    private fun visitBooleanExpression(node: BooleanExpression, file: KtFile) {
        when (node) {
        // Если операнд, то переходим к его подвыражению
            is Not -> visitBooleanExpression(node.child, file)
            is Or -> {
                visitBooleanExpression(node.left, file)
                visitBooleanExpression(node.right, file)
            }
            is And -> {
                visitBooleanExpression(node.left, file)
                visitBooleanExpression(node.right, file)
            }
            // Если это элемент
            is CallNodeItem -> CallPsiTagSetter.visitFile(file, node)
            is ExecutionNodeItem -> ExecutePsiTagSetter.visitFile(file, node)
            is TargetNodeItem -> TargetPsiTagSetter.visitFile(file, node)
        }
    }

    private fun recursiveSetPointcutTag(psiElement: PsiElement, pointcut: Pointcut) {
        if (pointcut.calcExpression(psiElement))
            psiElement.getUserData(TargetProjectContainer.tagKey)?.add(pointcut.key)
        psiElement.children.forEach { recursiveSetPointcutTag(it, pointcut) }
    }
}