aspect A  {
    pointcut fooPC(): execution(fun Foo.foo());
    pointcut printPC(): call(fun println(String));

    before(): fooPC() && printPC() {
        println("Test");
    }
}