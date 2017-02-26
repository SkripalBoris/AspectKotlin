package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.AspectItem
import models.aspect.items.CallNodeItem
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.psiUtil.collectDescendantsOfType
import org.jetbrains.kotlin.resolve.calls.callUtil.getResolvedCall
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.synthetic.isVisibleOutside
import psi.TargetProjectContainer

/**
 * Created by sba on 07.01.17.
 */

object CallPsiTagSetter : FunctionTagSetter() {
    override fun setTag(psiElement: PsiElement, aspectItem: AspectItem) {
        psiElement.collectDescendantsOfType<KtCallExpression>().forEach {
            if (checkFunction(it, aspectItem))
                if (it.getUserData(TargetProjectContainer.tagKey) == null)
                    it.putUserData(TargetProjectContainer.tagKey, mutableListOf(aspectItem.key))
                else
                    it.getUserData(TargetProjectContainer.tagKey)!!.add(aspectItem.key)
        }
    }

    override fun visitFile(file: KtFile, aspectItem: AspectItem) {
        if (aspectItem !is CallNodeItem)
            throw IllegalArgumentException("Node item must be a CallNodeItem")
        setTag(file, aspectItem)
        return
    }

    private fun checkFunction(psiElement: KtCallExpression, aspectItem: AspectItem): Boolean {
        val resolvedFunDescriptor = psiElement.getResolvedCall(TargetProjectContainer.context!!)!!.candidateDescriptor
        val funName = resolvedFunDescriptor.name.asString()
        val funPackage = resolvedFunDescriptor.containingDeclaration.fqNameSafe.asString()
        if (aspectItem is CallNodeItem) {
            if (! (this.checkName(aspectItem.methodPattern.name, funName) &&
                    this.checkType(aspectItem.methodPattern.type, funPackage) &&
                    this.checkType(aspectItem.methodPattern.returnType!!, resolvedFunDescriptor.returnType.toString())))
                return false
            aspectItem.methodPattern.modifiers.forEach {
                when (it) {
                    "public" -> {
                        if (resolvedFunDescriptor.visibility.name != "public")
                            return false
                    }

                    "private" -> {
                        if (resolvedFunDescriptor.visibility.name != "private" ||
                                resolvedFunDescriptor.visibility.name != "protected")
                            return false
                    }

                    "protected" -> {
                        if (resolvedFunDescriptor.visibility.name != "protected")
                            return false
                }

                else -> throw IllegalArgumentException("Unexpected modifier")
                }
            }
            return true
        }
        throw IllegalArgumentException("Illegal aspectItem")
    }
}