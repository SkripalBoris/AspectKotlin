aspect A  {
    pointcut fooPC(): execution(fun Test.foo(): Int);
    pointcut gooPC(): execution(fun Test.goo());
    pointcut printPC(): call(fun println(String));

    before(): (cflow(fooPC()) || !cflow(gooPC())) && printPC() && !within(A) {
        println("Hello, world!");
    }
}