aspect A  {
    pointcut fooPC(): execution(fun Foo.foo());
    pointcut printPC(): call(fun kotlin.io.println(String));

    before(): fooPC() && printPC() {
        println("Hello!!")
        println("world!!")
    }
}