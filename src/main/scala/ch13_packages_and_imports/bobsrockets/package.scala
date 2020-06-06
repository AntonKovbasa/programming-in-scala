package ch13_packages_and_imports

package object bobsrockets {

  def showFruit(fruit: Fruit): Unit = {
    import fruit._
    println(name + "s are " + color)
  }
}
