package ch13_packages_and_imports.bobsrockets

class Rocket {

  import Rocket.fuel

  private def canGoHomeAgain = fuel > 20
}

object Rocket {
  def chooseStrategy(rocket: Rocket): Unit = {
    if (rocket.canGoHomeAgain) goHome()
    else
      pickAStar()
  }

  def goHome(): Unit = {}

  def pickAStar(): Unit = {}

  private def fuel = 10
}
