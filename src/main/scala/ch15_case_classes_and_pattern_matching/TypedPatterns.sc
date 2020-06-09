def generalSize(x: Any) = x match {
  case s: String => s.length
  case m: Map[_, _] => m.size
  case _ => -1
}
generalSize("abc")
generalSize(Map(1 -> 'a', 2 -> 'b'))
generalSize(math.Pi)
"abc".isInstanceOf[String]
"abc".asInstanceOf[String]

def generalSize1(x: Any) =
  if (x.isInstanceOf[String]) {
    val s = x.asInstanceOf[String]
    s.length
  } //else
