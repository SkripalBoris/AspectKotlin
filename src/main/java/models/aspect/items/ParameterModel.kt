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
                     val parameterList: List<ParameterModel> = listOf()): MaybeNegativeModel(name, negative) {

    override fun toString() = StringBuilder().apply {
        if (negative) append("! ")
        if (packageName.isNotEmpty()) append("$packageName.")

        append(name)

        if (parameterList.isNotEmpty()) {
            parameterList.joinToString(separator = ", ").let { append("<$it>") }
        }

        when (nullableModifier) {
            NullabilityType.NULLABLE -> append("?")
            NullabilityType.NOT_NULL -> append("!!")
            else -> {}
        }
    }.toString()

    fun getFullName() = StringBuilder().apply {
        if (packageName.isNotEmpty()) append("$packageName.")

        append(name)

        if (parameterList.isNotEmpty()) {
            parameterList.joinToString(separator = ", ").let { append("<$it>") }
        }
    }.toString()

}