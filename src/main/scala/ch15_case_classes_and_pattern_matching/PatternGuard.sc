abstract class Expr

case class Var(name: String) extends Expr

case class Number(num: Double) extends Expr

case class UnOp(operator: String, arg: Expr) extends Expr

case class BinOp(operator: String,
                 left: Expr, right: Expr) extends Expr

/*error: x is already defined as value x
def simplifyAdd(expr: Expr) = expr match {
  case BinOp("+", x ,x) => BinOp("*", x, Number(2))
}*/

def simplifyAdd(expr: Expr) = expr match {
  case BinOp("+", x, y) if x == y => BinOp("*", x, Number(2))
  case _ => expr
}
val a = simplifyAdd(BinOp("+", Number(4), Number(4)))

//case n: Int if 0 < n => ...
//case s: String if s(0) == 'a' => ...
