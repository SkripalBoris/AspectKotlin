package psi.visitors

import models.aspect.items.MaybeNegativeModel
import models.aspect.items.ParameterModel
import models.aspect.items.NullabilityType
import org.jetbrains.kotlin.descriptors.ValueParameterDescriptor

/**
 * Created by sba on 24.02.17.
 */
abstract class FunctionTagSetter : PsiTagSetter {
    protected fun checkType(expectedTypePatternString: ParameterModel, realType: String): Boolean {
        return expectedTypePatternString.name.isEmpty() ||
                realType.replace(" ", "").matches(expectedTypePatternString.name.replace(".", "\\.").replace("*", ".*").replace(" ", "").toRegex())
    }

    protected fun checkName(expectedNamePatternString: MaybeNegativeModel, realName: String): Boolean {
        return expectedNamePatternString.negative.xor(realName.matches(expectedNamePatternString.name.replace("*", ".*").toRegex()))
    }

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