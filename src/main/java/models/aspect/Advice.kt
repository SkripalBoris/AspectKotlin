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

open class Advice(var pointcutExpression: BooleanExpression,
                  var adviceCode: String,
                  var parameterList: List<ArgumentModel>,
                  val pointcutList : List<Pointcut>) : AspectItem() {

    override fun toString(): String {
        val paramStr = parameterList.fold("") { total, next -> if (total.isEmpty()) next.toString() else "$total, $next" }
        return "($paramStr): $pointcutExpression {\n$adviceCode\n}"
    }

    override fun calcExpression(psiElement: PsiElement): Boolean {
        return this.pointcutExpression.calcExpression(psiElement)
    }

    fun getFunction(targetIdentifier: String): Pair<String, String> {
        val paramList = mutableListOf<ArgumentModel>()
        val targetId = haveTarget()
        if (!targetId.isEmpty())
            parameterList.find{param -> param.identifier == targetId}?.let {
                paramList.add(it)
            }
        val functionName: String = "adviceFun${SecureRandom().nextInt(Int.MAX_VALUE)}"
        val argsList = mutableListOf<String>()
        if (!targetId.isEmpty())
            argsList.add(targetIdentifier)

        val paramsString = paramList.fold(""){total, next -> if (total.isEmpty())next.toString() else "$total, $next"}
        val argsString = argsList.fold(""){total, next -> if (total.isEmpty())next else "$total, $next"}
        return Pair("$functionName($argsString)", "fun $functionName($paramsString){\n$adviceCode}\n")
    }

    open fun wrapPointcut(pointcutStr: String, targetIdentifier: String): String {
        throw NotImplementedError()
    }

    private fun haveTarget(): String {
        // Считаем, что в каждом срезе может быть только один target
        fun getTargetIdentifier(boolExpNode: BooleanExpression) : String {
            if (boolExpNode is ReferencePointcutNodeItem) {
                pointcutList.findLast { pointcut -> pointcut.id == boolExpNode.identifier }?.let { refPointcut ->
                    return getTargetIdentifier(refPointcut.pointcutExpression)
                }
                throw Exception("Undefined pointcut id")
            }
            if (boolExpNode is And)
                return "${getTargetIdentifier(boolExpNode.getLeftNode())}${getTargetIdentifier(boolExpNode.getRightNode())}"
            if (boolExpNode is Or)
                return "${getTargetIdentifier(boolExpNode.getLeftNode())}${getTargetIdentifier(boolExpNode.getRightNode())}"
            if (boolExpNode is Not)
                return getTargetIdentifier(boolExpNode.getChild())
            if (boolExpNode is TargetNodeItem)
                return boolExpNode.type.identifier
            return ""
        }
        return getTargetIdentifier(this.pointcutExpression)
    }
}