package models.aspect.items

/**
 * Created by sba on 05.01.17.
 */

class CallNodeItem(var methodPattern: MethodPattern) : AspectItem {

    override fun toString(): String {
        return "(call($methodPattern))"
    }
}
