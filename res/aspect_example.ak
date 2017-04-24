aspect A  {

    pointcut fooPC(): execution(fun Foo.*())
    pointcut printPC(): call(public fun kotlin.io.pri*(!Any!!): Unit!!)
    pointcut parsePC(): call(fun parseExpression())

    pointcut callFoo(): execution(inline fun Foo.*(String))
    pointcut tFoo(): target(Foo)

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

    around(): tFoo() {
        println("Foo call")
    }
}