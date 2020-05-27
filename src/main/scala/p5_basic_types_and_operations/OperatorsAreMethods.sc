val sum = 1 + 2 // Scala invokes 1.+(2)
val sumMore = 1.+(2)
val longSum = 1 + 2L // Scala invokes 1.+(2L)

val s = "Hello, world!"
s indexOf 'o' // Scala invokes s.indexOf('o')
s indexOf ('o', 5) // Scala invokes s.indexOf('o', 5)

//The only identifiers that can be used as prefix operators are +, -, !, and ~.
-2.0 // Scala invokes (2.0).unary_-
(2.0).unary_-

val s1 = "Hello, world!"
s.toLowerCase
import scala.language.postfixOps
s toLowerCase