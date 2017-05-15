aspect C  {
    pointcut tFoo(foo: Foo): target(foo)

    pointcut fooPC(): execution(fun Foo.*())
    pointcut printPC(): call(public fun kotlin.io.pri*(!Any!!): Unit!!)
    pointcut parsePC(): call(fun parseExpression())

    pointcut callFoo(): execution(inline fun Foo.*(String))
    pointcut tFoo(foo: Foo): target(foo)

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

    around(foo: Foo): tFoo(foo) && call (fun foo()) {
        val f2 = 2
            foo.baz("test")
        }
}