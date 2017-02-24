package models.aspect.items

/**
 * Created by sba on 05.01.17.
 */

//TODO Поддержка не только простых типов
class MethodPattern(var annotations: List<String>, var modifiers: List<String>, var type: String, var name: String, var params: List<String>, var returnType: String?) {
    init {
        if (returnType == null)
            returnType = "Unit"
    }

    override fun toString(): String {
        var retStr = ""
        annotations.forEach {
            retStr += "$it "
        }

        modifiers.forEach {
            retStr += "$it "
        }

        if (type.isEmpty())
            retStr += "fun $name("
        else
            retStr += "fun $type.$name("

        if (params.isNotEmpty())
            params.forEach {
                retStr += it
                if (it != params.last())
                    retStr += ", "
            }

        retStr += ")"

        if (returnType != null) {
            retStr += ": $returnType"
        }
        return retStr
    }
}