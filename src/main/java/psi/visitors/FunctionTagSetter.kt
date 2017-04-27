package psi.visitors

import models.aspect.items.MaybeNegativeParameter
import models.aspect.items.NullabilityType
import org.jetbrains.kotlin.descriptors.ValueParameterDescriptor

/**
 * Created by sba on 24.02.17.
 */
abstract class FunctionTagSetter : PsiTagSetter {
    protected fun checkType(expectedTypePatternString: MaybeNegativeParameter, realType: String): Boolean {
        return expectedTypePatternString.text.isEmpty() ||
                realType.replace(" ", "").matches(expectedTypePatternString.text.replace(".", "\\.").replace("*", ".*").replace(" ", "").toRegex())
    }

    protected fun checkName(expectedNamePatternString: MaybeNegativeParameter, realName: String): Boolean {
        return expectedNamePatternString.negative.xor(realName.matches(expectedNamePatternString.text.replace("*", ".*").toRegex()))
    }

    protected fun checkValueParams(expectedValuesParams: List<MaybeNegativeParameter>, realValueParams: List<MaybeNegativeParameter>): Boolean {
        if (expectedValuesParams.size != realValueParams.size)
            return false
        if (expectedValuesParams.isEmpty())
            return true

        for (i in 0..(expectedValuesParams.size - 1)) {
            var matchRes = checkType(expectedValuesParams[i], realValueParams[i].text)
            if (expectedValuesParams[i].nullableModifier != NullabilityType.ANYTHING)
                matchRes = matchRes && (expectedValuesParams[i].nullableModifier == realValueParams[i].nullableModifier)

            if (!expectedValuesParams[i].negative.xor(matchRes))
                return false
        }
        return true
    }
}