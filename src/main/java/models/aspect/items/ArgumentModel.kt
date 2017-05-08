package models.aspect.items

/**
 * Created by boris on 08.05.17.
 */
class ArgumentModel(var argumentType: ParameterModel, var identifier: String) {
    override fun toString(): String {
        return "$identifier: $argumentType"
    }
}