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
class MethodPattern(val annotations: List<ParameterModel>,
                    val modifiers: List<ParameterModel>,
                    val type: ParameterModel,
                    val name: ParameterModel,
                    val params: List<ParameterModel>,
                    val returnType: ParameterModel,
                    val extensionModifier: ExtensionType = ExtensionType.ANYTHING,
                    val inlineModifier: InlineType = InlineType.ANYTHING) {
    init {
        if (returnType.typeName.isEmpty())
            returnType.typeName = "Unit"
    }

    override fun toString(): String {
        var retStr = ""
        annotations.forEach {
            retStr += "$it "
        }

        modifiers.forEach {
            retStr += "$it "
        }

        when (this.extensionModifier) {
            ExtensionType.EXTENSION -> retStr += "extension "
            ExtensionType.NOT_EXTENSION -> retStr += "!extension "
            ExtensionType.ANYTHING -> {}
        }

        when (this.inlineModifier) {
            InlineType.INLINE -> retStr += "inline "
            InlineType.NOT_INLINE -> retStr += "!inline "
            InlineType.ANYTHING -> {}
        }

        if (type.typeName.isEmpty())
            retStr += " fun $name("
        else
            retStr += " fun $type.$name("

        if (params.isNotEmpty())
            params.forEach {
                retStr += it
                if (it != params.last())
                    retStr += ", "
            }

        retStr += ") : $returnType"

        return retStr
    }
}