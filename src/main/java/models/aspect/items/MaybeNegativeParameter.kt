package models.aspect.items

/**
 * Created by sba on 26.02.17.
 */

enum class NullabilityType {
    NULLABLE,
    NOT_NULL,
    ANYTHING
}

class MaybeNegativeParameter(var text: String, var negative: Boolean, var nullableModifier: NullabilityType = NullabilityType.ANYTHING) {
    override fun toString(): String {
        var retStr = ""
        if (negative)
            retStr += "! "

        retStr += text

        when (nullableModifier) {
            NullabilityType.NULLABLE -> retStr += "?"
            NullabilityType.NOT_NULL -> retStr += "!!"
            else -> {}
        }

        return retStr
    }
}