aspect A  {
    pointcut fooPC(): execution(fun Foo.*())
    pointcut callFooPC(): call(public fun foo())
    pointcut printPC(): call(public fun kotlin.io.pri*(String))
    pointcut parsePC(): call(fun parseExpression())

    after(): fooPC() && printPC() {
        println("Hello after!!")
    }

    before(): fooPC() && printPC() {
        println("Hello before!!")
    }

    before(): callFooPC() {
            println("Hello before foo call!!")
        }

    after(): parsePC() {
        println("Please work after")
    }

    before(): parsePC() {
            println("work before")
        }
}