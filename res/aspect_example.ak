aspect A  {
    pointcut fooPC(): execution(fun Foo.foo());
    pointcut printPC(): call(fun kotlin.io.println(String));
    pointcut parsePC(): call(fun parseExpression());

    after(): fooPC() && printPC() {
        println("Hello!!")
        println("world!!")
    }

    after(): parsePC() {
        println("Please work after")
    }

    before(): parsePC() {
            println("work before")
        }
}