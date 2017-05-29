package models.aspect.items

import com.intellij.psi.PsiElement
import psi.TargetProjectContainer

/**
 * Created by sba on 31.01.17.
 */
class ReferencePointcutNodeItem(val identifier: String, var referencePointcutKey: Int) : AspectItem() {

    override fun calcExpression(psiElement: PsiElement): Boolean =
        psiElement.getUserData(TargetProjectContainer.tagKey)?.let { tags -> referencePointcutKey in tags } ?: false

}