package models.aspect.items

/**
 * Created by sba on 26.02.17.
 */

enum class ParameterType {
    NULLABLE,
    NOT_NULL,
    ANYTHING
}

class MaybeNegativeParameter(var text: String, var negative: Boolean, var nullableModifier: ParameterType = ParameterType.ANYTHING) {
    override fun toString(): String {
        var retStr = ""
        if (negative)
            retStr += "! "

        retStr += text

        when (nullableModifier) {
            ParameterType.NULLABLE -> retStr += "?"
            ParameterType.NOT_NULL -> retStr += "!!"
            else -> {}
        }

        return retStr
    }
}