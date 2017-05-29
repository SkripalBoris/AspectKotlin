package models.aspect

/**
 * Created by sba on 30.11.16.
 */

data class Aspect(val id: String, val pointcuts: List<Pointcut>, val advices: List<Advice>)