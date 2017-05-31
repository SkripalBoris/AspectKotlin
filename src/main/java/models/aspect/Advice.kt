package models.aspect

import com.intellij.psi.PsiElement
import models.aspect.items.ArgumentModel
import models.aspect.items.AspectItem
import models.aspect.items.ReferencePointcutNodeItem
import models.aspect.items.TargetNodeItem
import models.boolExpr.And
import models.boolExpr.BooleanExpression
import models.boolExpr.Not
import models.boolExpr.Or
import java.security.SecureRandom

/**
 * Created by sba on 30.11.16.
 */

abstract class Advice(val pointcutExpression: BooleanExpression,
                      val adviceCode: String,
                      val parameterList: List<ArgumentModel>,
                      val pointcutList: List<Pointcut>) : AspectItem() {

    var targetIdentifier: String? = null

    override fun toString() = "(${parameterList.joinToString(separator = ", ")}): $pointcutExpression {\n$adviceCode\n}"

    override fun calcExpression(psiElement: PsiElement) = pointcutExpression.calcExpression(psiElement)

    fun getFunction(): Pair<String, String> {
        val paramList = mutableListOf<ArgumentModel>()
        val targetId = haveTarget()
        val targetIterator = "adviceIt${SecureRandom().nextInt(Int.MAX_VALUE)}"
        if (targetId.isNotEmpty()) {
            parameterList.find { param -> param.identifier == targetId }?.let {
                paramList.add(it)
                targetIdentifier = targetIterator
            }
        }
        val functionName: String = "adviceFun${SecureRandom().nextInt(Int.MAX_VALUE)}"
        val argsList = mutableListOf<String>()
        targetIdentifier?.let { argsList.add(it) }
        return "$functionName(${argsList.joinToString(separator = ", ")})" to
                "fun $functionName(${paramList.joinToString(separator = ", ")}){\n$adviceCode}\n"
    }

    abstract fun wrapPointcut(pointcutStr: String): String

    protected fun haveTarget(): String {
        // Считаем, что в каждом срезе может быть только один target
        fun getTargetIdentifier(boolExpNode: BooleanExpression): String = when (boolExpNode) {
            is ReferencePointcutNodeItem -> {
                pointcutList.findLast { pointcut -> pointcut.id == boolExpNode.identifier }?.let { refPointcut ->
                    return getTargetIdentifier(refPointcut.pointcutExpression)
                }
                throw Exception("Undefined pointcut id")
            }
            is And -> "${getTargetIdentifier(boolExpNode.left)}${getTargetIdentifier(boolExpNode.right)}"
            is Or -> "${getTargetIdentifier(boolExpNode.left)}${getTargetIdentifier(boolExpNode.right)}"
            is Not -> getTargetIdentifier(boolExpNode.child)
            is TargetNodeItem -> boolExpNode.type.identifier
            else -> ""
        }
        return getTargetIdentifier(this.pointcutExpression)
    }
}