val people = Set("Nancy", "Jane")
//people += "Bob"

var people1 = Set("Nancy", "Jane")
people1 += "Bob"
people1
people1 -= "Jane"
people1 ++= Set("Tom", "Harry")
people1

var capital = Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokyo")
println(capital("France"))

var roughlyPi = 3.0
roughlyPi += 0.1
roughlyPi += 0.04
roughlyPi