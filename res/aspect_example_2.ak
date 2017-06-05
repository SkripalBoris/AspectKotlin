aspect B  {
    pointcut BarPC(): call(inline fun fas(String))

    after(): BarPC() {
        println("bar")
    }
}