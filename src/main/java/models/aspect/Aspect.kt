package models.aspect

/**
 * Created by sba on 30.11.16.
 */

class Aspect(var id: String, var pointcuts: List<Pointcut>) {
    init {
        this.id = ""
        this.pointcuts = mutableListOf<Pointcut>()
    }
}