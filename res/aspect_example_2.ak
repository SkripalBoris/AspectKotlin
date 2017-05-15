aspect B  {
    pointcut BarPC(): !execution(extension !inline fun bar())

    after(): BarPC() {
        println("bar")
    }
}