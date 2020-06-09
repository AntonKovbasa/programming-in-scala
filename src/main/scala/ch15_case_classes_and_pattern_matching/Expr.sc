import ch15_case_classes_and_pattern_matching.{BinOp, Expr, Number, UnOp, Var}

val v = Var("x") // case modifier adds a factory method with the name of the class.
val op = BinOp("+", Number(1), v)

v.name // all arguments in the parameter list of a case class implicitly get a val prefix, so they are maintained as fields
op.left

println(op)
op.right == Var("x")

op.copy(operator = "-") //the compiler adds a copy method to your class for making modified copies

def simplifyTop(expr: Expr) =
  expr match {
    case UnOp("-", UnOp("-", e)) => e // Double negation
    case BinOp("+", e, Number(0)) => e // Adding zero
    case BinOp("*", e, Number(1)) => e // Multiplying by one
    case _ => expr
  }
simplifyTop(UnOp("-", UnOp("-", Var("x"))))

def fun(expr: Expr): Unit =
  expr match {
    case BinOp(op, left, right) =>
      println(expr + " is a binary operation")
    case _ =>
  }





