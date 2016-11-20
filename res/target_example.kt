class Test() {
    fun foo() : Int {
        println("Foo fun")
        return 42
    }

    fun goo() {
        println("Goo fun "+foo())
    }
}

fun main(args : Array<String>) {
    Test().goo()
}