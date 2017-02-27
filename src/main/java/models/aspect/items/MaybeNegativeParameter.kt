package models.aspect.items

/**
 * Created by sba on 26.02.17.
 */
class MaybeNegativeParameter(var text: String, var negative: Boolean) {
    override fun toString(): String {
        if (negative)
            return "! $text"
        return text
    }
}