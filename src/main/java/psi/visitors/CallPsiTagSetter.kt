package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.AspectItem
import org.jetbrains.kotlin.psi.KtFile

/**
 * Created by sba on 07.01.17.
 */

class CallPsiTagSetter: PsiTagSetter {
    override fun setTag(psiElement: PsiElement, aspectItem: AspectItem) {
        return
    }

    override fun visitFile(file: KtFile) {
        return
    }
}