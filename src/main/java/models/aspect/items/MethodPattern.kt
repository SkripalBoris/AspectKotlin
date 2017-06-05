package models.aspect.items

/**
 * Created by sba on 05.01.17.
 */

enum class ExtensionType {
    EXTENSION,
    NOT_EXTENSION,
    ANYTHING
}

//TODO Поддержка не только простых типов
data class MethodPattern(val annotations: List<NegativeNameModel>,
                    val modifiers: List<NegativeNameModel>,
                    val type: ParameterModel,
                    val name: NegativeNameModel,
                    val params: List<ParameterModel>,
                    val returnType: ParameterModel,
                    val extensionModifier: ExtensionType = ExtensionType.ANYTHING) {

    override fun toString() = StringBuilder().apply {
        annotations.forEach { append("$it ") }
        modifiers.forEach { append("$it ") }

        when (extensionModifier) {
            ExtensionType.EXTENSION -> append("extension ")
            ExtensionType.NOT_EXTENSION -> append("!extension ")
            else -> {
            }
        }

        if (type.name.isEmpty())
            append(" fun $name(")
        else
            append(" fun $type.$name(")

        params.forEach {
            append(it)
            if (it != params.last())
                append(", ")
        }

        append("): $returnType")
    }.toString()

}