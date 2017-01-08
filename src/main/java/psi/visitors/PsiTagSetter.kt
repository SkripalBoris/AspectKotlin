package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.AspectItem
import org.jetbrains.kotlin.psi.KtFile

/**
 * Created by sba on 07.01.17.
 */

interface PsiTagSetter{
    fun setTag(psiElement: PsiElement, aspectItem: AspectItem)

    fun visitFile(file: KtFile, aspectItem: AspectItem)
}