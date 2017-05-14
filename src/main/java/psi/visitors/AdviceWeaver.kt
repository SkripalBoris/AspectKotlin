package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.Advice
import org.jetbrains.kotlin.psi.*

/**
 * Created by sba on 31.01.17.
 */
object AdviceWeaver {
    fun visitFiles(targetFiles: List<KtFile>, advice: Advice) {
        targetFiles.forEach { visitFile(it, advice) }
    }

    private fun visitFile(targetFile: KtFile, advice: Advice) {
        recursiveAdviceInjector(targetFile, advice)
    }

    private fun recursiveAdviceInjector(psiElement: PsiElement, advice: Advice) {
        if (advice.calcExpression(psiElement))
            this.setAdviceCode(psiElement, advice)
        else
            psiElement.children.forEach { recursiveAdviceInjector(it, advice) }
    }

    private fun setAdviceCode(psiElement: PsiElement, advice: Advice) {
        val par = psiElement.parent
        val targetIdentifier = getTargetIdentifier(psiElement)
        psiElement.replace(KtPsiFactory(psiElement).createExpression(advice.wrapPointcut(psiElement.text, targetIdentifier)))
        refreshUserMap(psiElement, par)
    }

    private fun getTargetIdentifier(psiElement: PsiElement): String {
        if (psiElement is KtCallExpression) {
            val parentNode = psiElement.parent
            if (parentNode is KtDotQualifiedExpression) {
                parentNode.children.firstOrNull()?.let{
                    return it.text
                }
            }
        }
        return ""
    }

    private fun refreshUserMap(oldElement: PsiElement, targetElement: PsiElement) {
        if (oldElement.javaClass == targetElement.javaClass && oldElement.text == targetElement.text)
            recursiveUpdateUserMap(oldElement, targetElement)
        else
            targetElement.children.forEach { refreshUserMap(oldElement, it) }
    }

    private fun recursiveUpdateUserMap(from: PsiElement, to: PsiElement) {
        if (from is KtExpressionImpl && to is KtExpressionImpl)
            from.copyUserDataTo(to)
        for (i in 0 until from.children.size) {
            recursiveUpdateUserMap(from.children[i], to.children[i])
        }
    }
}