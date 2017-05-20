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
                  val pointcutList : List<Pointcut>) : AspectItem() {

    var targetIdentifier: String? = null

    override fun toString(): String {
        val paramStr = parameterList.fold("") { total, next -> if (total.isEmpty()) next.toString() else "$total, $next" }
        return "($paramStr): $pointcutExpression {\n$adviceCode\n}"
    }

    override fun calcExpression(psiElement: PsiElement): Boolean {
        return this.pointcutExpression.calcExpression(psiElement)
    }

    fun getFunction(): Pair<String, String> {
        val paramList = mutableListOf<ArgumentModel>()
        val targetId = haveTarget()
        val targetIterator = "adviceIt${SecureRandom().nextInt(Int.MAX_VALUE)}"
        if (!targetId.isEmpty())
            parameterList.find{param -> param.identifier == targetId}?.let {
                paramList.add(it)
                this.targetIdentifier = targetIterator
            }
        val functionName: String = "adviceFun${SecureRandom().nextInt(Int.MAX_VALUE)}"
        val argsList = mutableListOf<String>()
        this.targetIdentifier?.let{argsList.add(targetIterator)}

        val paramsString = paramList.fold(""){total, next -> if (total.isEmpty())next.toString() else "$total, $next"}
        val argsString = argsList.fold(""){total, next -> if (total.isEmpty())next else "$total, $next"}
        return Pair("$functionName($argsString)", "fun $functionName($paramsString){\n$adviceCode}\n")
    }

    abstract fun wrapPointcut(pointcutStr: String): String

    protected fun haveTarget(): String {
        // Считаем, что в каждом срезе может быть только один target
        fun getTargetIdentifier(boolExpNode: BooleanExpression) : String {
            if (boolExpNode is ReferencePointcutNodeItem) {
                pointcutList.findLast { pointcut -> pointcut.id == boolExpNode.identifier }?.let { refPointcut ->
                    return getTargetIdentifier(refPointcut.pointcutExpression)
                }
                throw Exception("Undefined pointcut id")
            }
            if (boolExpNode is And)
                return "${getTargetIdentifier(boolExpNode.left)}${getTargetIdentifier(boolExpNode.right)}"
            if (boolExpNode is Or)
                return "${getTargetIdentifier(boolExpNode.left)}${getTargetIdentifier(boolExpNode.right)}"
            if (boolExpNode is Not)
                return getTargetIdentifier(boolExpNode.child)
            if (boolExpNode is TargetNodeItem)
                return boolExpNode.type.identifier
            return ""
        }
        return getTargetIdentifier(this.pointcutExpression)
    }
}