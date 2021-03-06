package models.aspect.items

/**
 * Created by boris on 14.05.17.
 */
abstract class MaybeNegativeModel(var name: String = "",
                              var negative: Boolean = false) {
    override fun toString() =
            if (negative) "! $name" else name
}