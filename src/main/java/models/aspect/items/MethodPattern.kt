package models.aspect.items

/**
 * Created by sba on 05.01.17.
 */

//TODO Поддержка не только простых типов
class MethodPattern(var annotations: List<MaybeNegativeParameter>, var modifiers: List<MaybeNegativeParameter>, var type: MaybeNegativeParameter, var name: MaybeNegativeParameter, var params: List<MaybeNegativeParameter>, var returnType: MaybeNegativeParameter?) {
    init {
        if (returnType == null)
            returnType = MaybeNegativeParameter("Unit", false, ParameterType.ANYTHING)
    }

    override fun toString(): String {
        var retStr = ""
        annotations.forEach {
            retStr += "$it "
        }

        modifiers.forEach {
            retStr += "$it "
        }

        if (type.text.isEmpty())
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