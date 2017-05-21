aspect A  {
  pointcut pExprPC() : execution(fun parseExpr(String, List<Int>): Map<Int, Int> )
  pointcut calcPC() : call(fun Expression.calculate(Int): Int)

  before(): pExprPC() && calcPC() {
    val l = java.util.logging.Logger.getLogger("ALog")
    l.info("Start ${System.currentTimeMillis()}")
  }

  after(): pExprPC() && calcPC() {
    val l = java.util.logging.Logger.getLogger("ALog")
    l.info("Finish ${System.currentTimeMillis()}")
  }
}