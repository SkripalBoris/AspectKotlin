aspect A  {
    pointcut FooPC(): call(fun foo())

    after(foo: Foo): target(foo) && FooPC() {
        println("foo")
    }
}