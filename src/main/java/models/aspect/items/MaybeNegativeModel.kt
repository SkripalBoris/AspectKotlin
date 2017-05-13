package models.aspect.items

/**
 * Created by boris on 14.05.17.
 */
open class MaybeNegativeModel(var name: String = "",
                              var negative: Boolean = false) {
    override fun toString(): String {
        return if (negative) "! $name" else name
    }
}