package models.aspect.items

/**
 * Created by sba on 05.01.17.
 */

class MethodPattern(var annotations: List<String>, var modifiers: List<String>, var types: List<String>, var name: String, var params: List<String>, var returnType: String?) {
    override fun toString(): String {
        var retStr = ""
        annotations.forEach {
            retStr += "$it "
        }

        modifiers.forEach {
            retStr += "$it "
        }

        types.forEach {
            retStr += "$it "
        }

        retStr += "fun $name("

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