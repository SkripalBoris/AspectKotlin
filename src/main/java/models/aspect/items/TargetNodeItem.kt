package models.aspect.items

import com.intellij.psi.PsiElement
import psi.TargetProjectContainer

/**
 * Created by boris on 25.04.17.
 */
class TargetNodeItem(val type: ArgumentModel) : AspectItem() {

    override fun toString() = "(target($type))"

    override fun calcExpression(psiElement: PsiElement): Boolean {
        val tags = psiElement.getUserData(TargetProjectContainer.tagKey)
        return tags != null && this.key in tags
    }
}