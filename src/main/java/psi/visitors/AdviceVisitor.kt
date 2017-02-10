package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.Advice
import org.jetbrains.kotlin.psi.*

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
        else
            psiElement.children.forEach { recursiveAdviceInjector(it, advice) }
    }

    private fun setAdviceCode(psiElement: PsiElement, advice: Advice) {
//        when (advice.adviceInsertPlace) {
//            "before()" -> this.buildAdviceCode(advice.adviceCode, psiElement).statements.forEach {
//                psiElement.parent.addBefore(it, psiElement)
//                psiElement.parent.addBefore(KtPsiFactory(psiElement).createNewLine(), psiElement)
//            }
//            "after()" -> this.buildAdviceCode(advice.adviceCode, psiElement).statements.reversed().forEach {
//                psiElement.parent.addAfter(it, psiElement)
//                psiElement.parent.addAfter(KtPsiFactory(psiElement).createNewLine(), psiElement)
//            } else -> throw IllegalArgumentException()
//        }
        val par = psiElement.parent
        when (advice.adviceInsertPlace) {
            "before()" -> {
                val buf = KtPsiFactory(psiElement).createExpression("run{${advice.adviceCode}${psiElement.text}}")
                psiElement.replace(buf)
            }
            "after()" ->  {
                val buf = KtPsiFactory(psiElement).createExpression("run{val ____a = ${psiElement.text}\n${advice.adviceCode}____a}")
                psiElement.replace(buf)
            }
            else -> throw IllegalArgumentException()
        }
        refreshUserMap(psiElement, par)
    }

    private fun refreshUserMap(oldElement: PsiElement, targetElement: PsiElement) {
        if (oldElement.javaClass == targetElement.javaClass && oldElement.text == targetElement.text)
            (oldElement as KtExpressionImpl).copyUserDataTo(targetElement as KtExpressionImpl)
        else
            targetElement.children.forEach { refreshUserMap(oldElement, it) }
    }
}