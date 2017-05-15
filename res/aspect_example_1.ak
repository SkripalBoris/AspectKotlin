aspect A  {
    pointcut FooPC(): call(fun foo())

    before(): FooPC() {
        println("foo")
    }
}