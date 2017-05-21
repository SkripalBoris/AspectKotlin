aspect E  {
    pointcut FooPC(): call(fun foo())

    around(): FooPC() {
        println("around text")
    }
}