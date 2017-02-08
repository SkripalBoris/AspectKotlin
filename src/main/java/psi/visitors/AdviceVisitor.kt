package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.Advice
import org.jetbrains.kotlin.psi.KtBlockExpression
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtPsiFactory

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
        when (advice.adviceInsertPlace) {
            "before()" -> this.buildAdviceCode(advice.adviceCode, psiElement).statements.forEach {
                psiElement.parent.addBefore(it, psiElement)
                psiElement.parent.addBefore(KtPsiFactory(psiElement).createNewLine(), psiElement)
            }
            "after()" -> this.buildAdviceCode(advice.adviceCode, psiElement).statements.reversed().forEach {
                psiElement.parent.addAfter(it, psiElement)
                psiElement.parent.addAfter(KtPsiFactory(psiElement).createNewLine(), psiElement)
            } else -> throw IllegalArgumentException()
        }
        return
    }

    private fun buildAdviceCode(text: String, psiElement: PsiElement): KtBlockExpression {
        return KtPsiFactory(psiElement).createBlock(text)
    }
}