

abstract class Expr

case class Var(name: String) extends Expr

case class Number(num: Double) extends Expr

case class UnOp(operator: String, arg: Expr) extends Expr

case class BinOp(operator: String,
                 left: Expr, right: Expr) extends Expr


val myTuple = (123, "abc")
val (number, string) = myTuple

val exp = new BinOp("*", Number(5), Number(1))
val BinOp(op, left, right) = exp

val withDefault: Option[Int] => Int = {
  case Some(x) => x
  case None => 0
}
withDefault(Some(10))
withDefault(None)


val second: List[Int] => Int = {
  case x :: y :: _ => y
}
second(List(5, 6, 7))
//second(List())

val second1: PartialFunction[List[Int], Int] = {
  case x :: y :: _ => y
}
second1.isDefinedAt(List(5, 6, 7))
second1.isDefinedAt(List())


val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
for ((country, city) <- capitals)
  println("The capital of " + country + " is " + city)
val results = List(Some("apple"), None, Some("orange"))
for (Some(fruit) <- results)
  println(fruit)