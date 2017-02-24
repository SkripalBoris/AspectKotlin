package psi.visitors

/**
 * Created by sba on 24.02.17.
 */
abstract class FunctionTagSetter : PsiTagSetter {
    protected fun checkType(expectedTypePatternString: String, realType: String): Boolean {
        return expectedTypePatternString.isEmpty() ||
                realType.matches(expectedTypePatternString.replace(".", "\\.").replace("*", ".*").toRegex())
    }

    protected fun checkName(expectedNamePatternString: String, realName: String): Boolean {
        return realName.matches(expectedNamePatternString.replace("*", ".*").toRegex())
    }
}