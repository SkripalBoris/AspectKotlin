package models.aspect.items

/**
 * Created by boris on 08.05.17.
 */
data class ArgumentModel(val argumentType: ParameterModel, val identifier: String) {
    override fun toString() = "$identifier: $argumentType"
}