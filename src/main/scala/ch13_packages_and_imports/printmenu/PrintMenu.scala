package ch13_packages_and_imports.printmenu

import ch13_packages_and_imports.bobsrockets.{Fruit, showFruit}

object PrintMenu {
  def main(args: Array[String]): Unit = {
    for (fruit <- Fruit.menu) {
      showFruit(fruit)
    }
  }
}