aspect A  {
    pointcut fooPC(): execution(fun Foo.foo());
    pointcut printPC(): call(fun kotlin.io.println(String));
    pointcut parsePC(): call(fun parseExpression());

    after(): fooPC() && printPC() {
        println("Hello after!!")
    }

    before(): fooPC() && printPC() {
        println("Hello before!!")
    }

    after(): parsePC() {
        println("Please work after")
    }

    before(): parsePC() {
            println("work before")
        }
}