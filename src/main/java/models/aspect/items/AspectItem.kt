package models.aspect.items

import models.boolExpr.BooleanExpression

/**
 * Created by sba on 07.01.17.
 */

abstract class AspectItem : BooleanExpression {
    val key = this.hashCode()
}