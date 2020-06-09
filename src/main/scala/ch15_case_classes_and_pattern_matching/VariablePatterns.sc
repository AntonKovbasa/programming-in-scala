def variablePatterns(expr: Any) =
  expr match {
    case 0 => "zero"
    case somethingElse => "not zero: " + somethingElse
  }
variablePatterns()

import scala.math.{E, Pi}

E match {
  case Pi => "strange math? Pi = " + Pi
  case _ => "OK"
}

val pi = math.Pi
E match {
  case pi => "strange math? Pi = " + pi
}
E match {
  case pi => "strange math? Pi = " + pi
  // case _ => "OK"
}
E match {
  case `pi` => "strange math? Pi = " + pi
  case _ => "OK"
}