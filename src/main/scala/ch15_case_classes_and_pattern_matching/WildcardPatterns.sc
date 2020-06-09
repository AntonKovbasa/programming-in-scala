abstract class Expr

case class Var(name: String) extends Expr

case class Number(num: Double) extends Expr

case class UnOp(operator: String, arg: Expr) extends Expr

case class BinOp(operator: String,
                 left: Expr, right: Expr) extends Expr


def wildcardPatterns(expr: Expr): Unit =
  expr match {
    case BinOp(op, left, right) =>
      println(expr + "is a binary operation")
    case _ => //handle the default case
  }
def wildcardPatterns(expr: Expr): Unit =
  expr match {
    case BinOp(_, _, _) =>
      println(expr + "is a binary operation")
    case _ => //handle the default case
  }