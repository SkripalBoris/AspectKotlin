package models.aspect.items

/**
 * Created by sba on 05.01.17.
 */

enum class ExtensionType {
    EXTENSION,
    NOT_EXTENSION,
    ANYTHING
}

enum class InlineType {
    INLINE,
    NOT_INLINE,
    ANYTHING
}

//TODO Поддержка не только простых типов
data class MethodPattern(val annotations: List<MaybeNegativeModel>,
                    val modifiers: List<MaybeNegativeModel>,
                    val type: ParameterModel,
                    val name: MaybeNegativeModel,
                    val params: List<ParameterModel>,
                    val returnType: ParameterModel,
                    val extensionModifier: ExtensionType = ExtensionType.ANYTHING,
                    val inlineModifier: InlineType = InlineType.ANYTHING) {

    override fun toString() = StringBuilder().apply {
        annotations.forEach { append("$it ") }
        modifiers.forEach { append("$it ") }

        when (extensionModifier) {
            ExtensionType.EXTENSION -> append("extension ")
            ExtensionType.NOT_EXTENSION -> append("!extension ")
            else -> {
            }
        }

        when (inlineModifier) {
            InlineType.INLINE -> append("inline ")
            InlineType.NOT_INLINE -> append("!inline ")
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