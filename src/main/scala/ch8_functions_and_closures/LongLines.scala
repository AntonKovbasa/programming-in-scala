package ch8_functions_and_closures

import scala.io.Source

object LongLines {

  def processFile(fileName: String, width: Int): Unit = {

    def processLine(line: String): Unit = {
      if (line.length > width)
        println(fileName + ": " + line.trim)
    }

    val sourceFile = Source.fromFile(fileName)
    for (line <- sourceFile.getLines())
      processLine(line)
  }



  /*private def processLine(fileName: String, width: Int, line: String): Unit = {
    if (line.length > width)
      println(fileName + ": " + line.trim)
  }*/
}
