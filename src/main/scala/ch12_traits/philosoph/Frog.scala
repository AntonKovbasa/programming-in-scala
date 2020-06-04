package ch12_traits.philosoph

class Frog extends Animal with Philosophical with HasLegs {
  override def toString: String = "green"

  override def philosophize(): Unit = {
    println("It ain't easy being " + toString + "!")
  }
}

object Frog {
  def main(args: Array[String]): Unit = {
    val frog = new Frog
    frog.philosophize()
    val phil: Philosophical = frog
    phil.philosophize()
  }
}
