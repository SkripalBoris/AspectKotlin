package models.aspect

import models.aspect.Pointcut

/**
 * Created by sba on 30.11.16.
 */

class Aspect(var id: String, var pointcuts: List<Pointcut>, var advices: List<Advice>) {
}