def list(expr: Any): Unit =
  expr match {
    case List(0, _, _) => println("found it")
    case _ =>
  }

def list(expr: Any): Unit =
  expr match {
    case List(0, _*) => println("found it")
    case _ =>
  }