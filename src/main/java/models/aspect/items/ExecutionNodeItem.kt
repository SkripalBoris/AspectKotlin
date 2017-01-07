package models.aspect.items

/**
 * Created by sba on 06.01.17.
 */

class ExecutionNodeItem(var methodPattern: MethodPattern) : AspectItem {

    override fun toString(): String {
        return "(execution($methodPattern))"
    }
}