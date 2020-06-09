package ch15_case_classes_and_pattern_matching

sealed abstract class Expr

case class Var(name: String) extends Expr

case class Number(num: Double) extends Expr

case class UnOp(operator: String, arg: Expr) extends Expr

case class BinOp(operator: String,
                 left: Expr, right: Expr) extends Expr


object Expr {
  def main(args: Array[String]): Unit = {
    def describe(e: Expr): String = e match {
      case Number(_) => "a number"
      case Var(_) => "a variable"
    }

    def describe1(e: Expr): String = (e: @unchecked) match {
      case Number(_) => "a number"
      case Var(_) => "a variable"
    }

  }
}
