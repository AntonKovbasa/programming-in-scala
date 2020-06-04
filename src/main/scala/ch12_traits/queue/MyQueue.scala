package ch12_traits.queue

class MyQueue extends BasicIntQueue with Doubling

object MyQueue {
  def main(args: Array[String]): Unit = {
    val queue = new MyQueue
    queue.put(10)
    println(queue.get())
  }
}
