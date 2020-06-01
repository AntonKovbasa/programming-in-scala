import java.io.{File, PrintWriter}
import java.util.Date

def twice(op: Double => Double, x: Double) = op(op(x))
twice(_ + 1, 4)

def withPrintWriter(file: File, op: PrintWriter => Unit): Unit = {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close();
  }
}
withPrintWriter(new File("/Users/anton/IdeaProjects/programming-in-scala/src/main/scala/p9_control_abstraction/date.txt"),
  _.println(new Date()))

def withPrintWriter(file: File)(op: PrintWriter => Unit): Unit = {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close();
  }
}
val file = new File("/Users/anton/IdeaProjects/programming-in-scala/src/main/scala/p9_control_abstraction/date.txt")
withPrintWriter(file) {
  _.println(new java.util.Date)
}


var assertionsEnabled = true
def myAssert(predicate: () => Boolean): Unit = if (assertionsEnabled && !predicate())
  throw new AssertionError
myAssert(() => 5 > 3)
//myAssert(5 > 3)

def byNameAssert(predicate: => Boolean): Unit = if (assertionsEnabled && !predicate)
  throw new AssertionError
byNameAssert(5 > 3)

def boolAssert(predicate: Boolean): Unit = if (assertionsEnabled && !predicate)
  throw new AssertionError
boolAssert(5 > 3)

assertionsEnabled = false
byNameAssert(5 / 0 == 1)
boolAssert(5 / 0 == 1)
