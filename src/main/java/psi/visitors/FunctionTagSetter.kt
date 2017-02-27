package psi.visitors

import models.aspect.items.MaybeNegativeParameter
import org.jetbrains.kotlin.descriptors.ValueParameterDescriptor

/**
 * Created by sba on 24.02.17.
 */
abstract class FunctionTagSetter : PsiTagSetter {
    protected fun checkType(expectedTypePatternString: MaybeNegativeParameter, realType: String): Boolean {
        return expectedTypePatternString.text.isEmpty() ||
                expectedTypePatternString.negative.xor(realType.matches(expectedTypePatternString.text.replace(".", "\\.").replace("*", ".*").toRegex()))
    }

    protected fun checkName(expectedNamePatternString: MaybeNegativeParameter, realName: String): Boolean {
        return expectedNamePatternString.negative.xor(realName.matches(expectedNamePatternString.text.replace("*", ".*").toRegex()))
    }

    protected fun checkValueParams(expectedValuesParams: List<MaybeNegativeParameter>, realValueParams: List<ValueParameterDescriptor>): Boolean {
        if (expectedValuesParams.size != realValueParams.size)
            return false
        if (expectedValuesParams.isEmpty())
            return true

        for (i in 0..(expectedValuesParams.size-1)) {
            if (expectedValuesParams[i].negative && expectedValuesParams[i].text == realValueParams[i].type.constructor.toString())
                return false
            if (!expectedValuesParams[i].negative && expectedValuesParams[i].text != realValueParams[i].type.constructor.toString())
                return false
        }
        return true
    }
}