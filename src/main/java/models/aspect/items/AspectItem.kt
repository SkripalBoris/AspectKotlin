package models.aspect.items

import com.intellij.openapi.util.Key
import models.boolExpr.BooleanExpression

/**
 * Created by sba on 07.01.17.
 */

abstract class AspectItem: BooleanExpression {
    var key = Key<String>(this.toString())
}