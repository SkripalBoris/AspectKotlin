package models.aspect.items

/**
 * Created by sba on 26.02.17.
 */

enum class NullabilityType {
    NULLABLE,
    NOT_NULL,
    ANYTHING
}

class ParameterModel(var typeName: String = "",
                     var negative: Boolean = false,
                     var packageName : String = "",
                     var nullableModifier: NullabilityType = NullabilityType.ANYTHING) {
    override fun toString(): String {
        var retStr = ""
        if (negative)
            retStr += "! "

        if (! packageName.isEmpty())
            retStr += "$packageName."
        retStr += typeName

        when (nullableModifier) {
            NullabilityType.NULLABLE -> retStr += "?"
            NullabilityType.NOT_NULL -> retStr += "!!"
            else -> {}
        }

        return retStr
    }
}