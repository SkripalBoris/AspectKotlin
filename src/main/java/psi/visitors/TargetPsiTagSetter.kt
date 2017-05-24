package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.*
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.psiUtil.collectDescendantsOfType
import org.jetbrains.kotlin.resolve.calls.callUtil.getResolvedCall
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.descriptorUtil.isExtension
import psi.TargetProjectContainer

/**
 * Created by boris on 25.04.17.
 */
object TargetPsiTagSetter : BaseTagSetter() {
    override fun setTag(psiElement: PsiElement, aspectItem: AspectItem) {
        psiElement.collectDescendantsOfType<KtCallExpression>().forEach {
            if (this.checkFunction(it, aspectItem))
                if (it.getUserData(TargetProjectContainer.tagKey) == null)
                    it.putUserData(TargetProjectContainer.tagKey, mutableListOf(aspectItem.key))
                else
                    it.getUserData(TargetProjectContainer.tagKey)!!.add(aspectItem.key)
        }
    }

    override fun visitFile(file: KtFile, aspectItem: AspectItem) {
        if (aspectItem !is TargetNodeItem)
            throw IllegalArgumentException("Node item must be a TargetNodeItem")
        setTag(file, aspectItem)
        return
    }

    private fun checkFunction(psiElement: KtCallExpression, aspectItem: AspectItem): Boolean {
        val resolvedCall = psiElement.getResolvedCall(TargetProjectContainer.context!!)?: return false
        val resolvedFunDescriptor = resolvedCall.candidateDescriptor
        val funPackage = if (resolvedFunDescriptor.isExtension) run {
                val extensionReceiver = resolvedFunDescriptor.extensionReceiverParameter ?: return false
                extensionReceiver.value.type.toString()
            }
        else resolvedFunDescriptor.containingDeclaration.fqNameSafe.asString()

        if (aspectItem is TargetNodeItem) {
            return checkType(aspectItem.type.argumentType, funPackage)
        }
        throw IllegalArgumentException("Illegal aspectItem")
    }
}