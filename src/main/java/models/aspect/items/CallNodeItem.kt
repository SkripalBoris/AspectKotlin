package models.aspect.items

import models.boolExpr.BooleanExpression

/**
 * Created by sba on 05.01.17.
 */

class CallNodeItem(var methodPattern: MethodPattern) : BooleanExpression {

    override fun toString(): String {
        return "(call($methodPattern))"
    }
}
