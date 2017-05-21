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
                     val nullableModifier: NullabilityType = NullabilityType.ANYTHING,
                     val parameterList :List<ParameterModel> = listOf()): MaybeNegativeModel(name, negative) {
    override fun toString(): String {
        var retStr = ""
        if (negative)
            retStr += "! "

        if (packageName.isNotEmpty())
            retStr += "$packageName."
        retStr += name

        if (parameterList.isNotEmpty()) {
            retStr += "<${parameterList.fold("") { total, next -> if (total.isEmpty()) next.toString() else "$total, $next" }}>"
        }

        when (nullableModifier) {
            NullabilityType.NULLABLE -> retStr += "?"
            NullabilityType.NOT_NULL -> retStr += "!!"
            else -> {}
        }

        return retStr
    }

    fun getFullName() : String{
        var retStr = ""
        if (packageName.isNotEmpty())
            retStr += "$packageName."
        retStr += name

        if (parameterList.isNotEmpty()) {
            retStr += "<${parameterList.fold("") { total, next -> if (total.isEmpty()) next.toString() else "$total, $next" }}>"
        }

        return retStr
    }
}