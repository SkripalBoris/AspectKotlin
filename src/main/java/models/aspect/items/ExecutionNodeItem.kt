package models.aspect.items

import models.boolExpr.BooleanExpression

/**
 * Created by sba on 06.01.17.
 */

class ExecutionNodeItem(var methodPattern: MethodPattern) : BooleanExpression {

    override fun toString(): String {
        return "(execution($methodPattern))"
    }
}