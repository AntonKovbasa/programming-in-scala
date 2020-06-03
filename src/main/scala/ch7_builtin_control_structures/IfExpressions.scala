package ch7_builtin_control_structures


object IfExpressions {

  def main(args: Array[String]): Unit = {
    var filename = "default.txt"
    if (!args.isEmpty)
      filename = args(0)

    val filename1 =
      if (!args.isEmpty) args(0)
      else "default.txt"

    println(if (!args.isEmpty) args(0) else
      "default.txt")

  }
}
