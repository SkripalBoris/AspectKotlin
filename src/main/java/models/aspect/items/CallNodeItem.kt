package models.aspect.items

import models.boolExpr.Terminal

/**
 * Created by sba on 05.01.17.
 */

class CallNodeItem(var methodPattern: MethodPattern) : Terminal("") {

    override fun toString(): String {
        return "(call ($methodPattern))"
    }
}
