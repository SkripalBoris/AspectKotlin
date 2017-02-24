aspect A  {
    pointcut fooPC(): execution(fun Foo.*())
    pointcut printPC(): call(fun kotlin.io.pri*(String))
    pointcut parsePC(): call(fun parseExpression())

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