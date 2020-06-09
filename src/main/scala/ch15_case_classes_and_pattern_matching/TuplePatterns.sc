def tupleDemo(expr: Any): Unit =
  expr match {
    case (a, b, c) => println("matched: " + a + b + c)
    case _ =>
  }

tupleDemo("a ", 3, "-tuple")