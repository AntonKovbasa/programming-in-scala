abstract class Expr

case class Var(name: String) extends Expr

case class Number(num: Double) extends Expr

case class UnOp(operator: String, arg: Expr) extends Expr

case class BinOp(operator: String,
                 left: Expr, right: Expr) extends Expr


def abs(expr: Expr) =
  expr match {
    case UnOp("abs", e @ UnOp("abs", _)) => e
    case _ =>
  }