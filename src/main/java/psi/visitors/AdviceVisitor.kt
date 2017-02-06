package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.Advice
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtPsiFactory
import psi.TargetProjectContainer

/**
 * Created by sba on 31.01.17.
 */
object AdviceVisitor {
    fun visitFiles(targetFiles: List<KtFile>, advice: Advice) {
        targetFiles.forEach { visitFile(it, advice) }
    }
    private fun visitFile(targetFile: KtFile, advice: Advice) {
        recursiveAdviceInjector(targetFile, advice)
    }

    private fun recursiveAdviceInjector(psiElement: PsiElement, advice: Advice) {
        if (advice.calcExpression(psiElement))
            this.setAdviceCode(psiElement, advice)
        psiElement.children.forEach { recursiveAdviceInjector(it, advice) }
    }

    private fun setAdviceCode(psiElement: PsiElement, advice: Advice) {
        psiElement.parent.addBefore(advice.adviceCode.children[0], psiElement)
        psiElement.parent.addBefore(KtPsiFactory(TargetProjectContainer.project).createNewLine(), psiElement)
        return
    }
}