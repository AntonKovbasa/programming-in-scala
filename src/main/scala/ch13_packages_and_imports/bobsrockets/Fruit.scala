package ch13_packages_and_imports.bobsrockets

abstract class Fruit(val name: String,
                     val color: String)


object Fruit {

  object Apple extends Fruit("apple", "red")

  object Orange extends Fruit("orange", "orange")

  object Pear extends Fruit("pear", "yellowish")

  val menu = List(Apple, Orange, Pear)

  def showFruit(fruit: Fruit): Unit = {
    import fruit._
    println(name + "s are " + color)
  }
}



