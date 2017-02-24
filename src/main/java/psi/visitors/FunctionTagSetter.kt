package psi.visitors

/**
 * Created by sba on 24.02.17.
 */
abstract class FunctionTagSetter: PsiTagSetter {
    protected fun checkType(expectedNamePatternString: String, realName: String, expectedTypePatternString: String, realType: String): Boolean {
        if (!realName.matches(expectedNamePatternString.replace("*", ".*").toRegex()))
            return false
        if (!expectedTypePatternString.isEmpty() &&
                !realType.matches(expectedTypePatternString.replace(".", "\\.").replace("*", ".*").toRegex()))
            return false
        return true
    }
}