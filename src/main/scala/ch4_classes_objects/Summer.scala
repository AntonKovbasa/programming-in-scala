package ch4_classes_objects

import ch4_classes_objects.ChecksumAccumulator.calculate

object Summer {

  def main(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
    Predef.println()
  }

}
