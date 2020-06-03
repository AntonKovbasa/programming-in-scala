package ch8_functions_and_closures

object FindLongLines {

  def main(args: Array[String]): Unit = {
    val width = args(0).toInt
    for(arg <- args.drop(0))
      LongLines.processFile(arg, width)
  }

}
