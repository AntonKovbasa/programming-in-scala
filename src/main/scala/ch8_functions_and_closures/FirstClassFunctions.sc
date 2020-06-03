var increase = (x: Int) => x + 1

increase(10)

increase = (x: Int) => {
  println("We")
  println("are")
  println("here!")
  x + 1
}

val someNumbers = List(-10, -5, 0, 5, 10)
someNumbers.foreach((x: Int) => println(x))
someNumbers.filter(x => x > 0)
someNumbers.filter(_ > 0)

//val f = _ + _  //error: missing parameter type for expanded
val f = (_: Int) + (_: Int)
f(5, 10)
