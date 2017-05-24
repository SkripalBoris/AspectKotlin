package psi.visitors

import com.intellij.psi.PsiElement
import models.aspect.items.AspectItem
import models.aspect.items.MaybeNegativeModel
import models.aspect.items.ParameterModel
import models.aspect.items.NullabilityType
import org.jetbrains.kotlin.psi.KtFile

/**
 * Created by sba on 24.02.17.
 */
abstract class BaseTagSetter {
    abstract fun setTag(psiElement: PsiElement, aspectItem: AspectItem)

    abstract fun visitFile(file: KtFile, aspectItem: AspectItem)

    protected fun checkType(expectedTypePatternString: ParameterModel, realType: String): Boolean =
        expectedTypePatternString.getFullName().isEmpty() ||
                realType.replace(" ", "").matches(expectedTypePatternString.getFullName().replace(".", "\\.").replace("*", ".*").replace(" ", "").toRegex())


    protected fun checkName(expectedNamePatternString: MaybeNegativeModel,
                            realName: String): Boolean =
            expectedNamePatternString.negative xor realName.matches(expectedNamePatternString.name.replace("*", ".*").toRegex())

    protected fun checkValueParams(expectedValuesParams: List<ParameterModel>, realValueParams: List<ParameterModel>): Boolean {
        if (expectedValuesParams.size != realValueParams.size)
            return false
        if (expectedValuesParams.isEmpty())
            return true

        for (i in 0..(expectedValuesParams.size - 1)) {
            var matchRes = checkType(expectedValuesParams[i], realValueParams[i].name)
            if (expectedValuesParams[i].nullableModifier != NullabilityType.ANYTHING)
                matchRes = matchRes && (expectedValuesParams[i].nullableModifier == realValueParams[i].nullableModifier)

            if (!expectedValuesParams[i].negative.xor(matchRes))
                return false
        }
        return true
    }
}