package models.aspect.items

/**
 * Created by sba on 26.02.17.
 */

enum class NullabilityType {
    NULLABLE,
    NOT_NULL,
    ANYTHING
}

class ParameterModel(name: String = "",
                     negative: Boolean = false,
                     var packageName : String = "",
                     val nullableModifier: NullabilityType = NullabilityType.ANYTHING): MaybeNegativeModel(name, negative) {
    override fun toString(): String {
        var retStr = ""
        if (negative)
            retStr += "! "

        if (! packageName.isEmpty())
            retStr += "$packageName."
        retStr += name

        when (nullableModifier) {
            NullabilityType.NULLABLE -> retStr += "?"
            NullabilityType.NOT_NULL -> retStr += "!!"
            else -> {}
        }

        return retStr
    }
}