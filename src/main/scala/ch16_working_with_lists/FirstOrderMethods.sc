List(1, 2, 3) ::: List(4, 5, 6)
List() ::: List(1, 2, 3)


def append[T](xs: List[T], ys: List[T]): List[T] =
  xs match {
    case List() => ys
    case x :: xs1 => x :: append(xs1, ys)
  }

append(List(1, 2, 3), List(4, 5, 6))

List(1, 2, 3).length

val abcde = List('a', 'b', 'c', 'd', 'e')
abcde.last
abcde.init
abcde.reverse

abcde take 2
abcde drop 2
abcde splitAt 2

abcde apply 2
abcde(2)

abcde.indices

List(List(1, 2), List(3), List(), List(4, 5)).flatten
val fruit = List("apples", "oranges", "pears")
fruit.map(_.toCharArray).flatten

abcde.indices zip abcde
val zipped = abcde zip List(1, 2, 3)
abcde.zipWithIndex
zipped.unzip

abcde.toString
abcde mkString("[", ",", "]")
abcde mkString ""
abcde.mkString
abcde mkString("List(", ", ", ")")
val buf = new StringBuilder
abcde addString(buf, "(", ";", ")")

val arr = abcde.toArray
arr.toList

val arr2 = new Array[Int](10)
List(1, 2, 3).copyToArray(arr2, 3)

val it = abcde.iterator
it.next
it.next


def msort[T](less: (T, T) => Boolean)(xs: List[T]): List[T] = {
  def merge(xs: List[T], ys: List[T]): List[T] =
    (xs, ys) match {
      case (Nil, _) => ys
      case (_, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (less(x, y)) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
    }

  val n = xs.length / 2
  if (n == 0) xs
  else {
    val (ys, zs) = xs splitAt n
    merge(msort(less)(ys), msort(less)(zs))
  }
}

msort((x: Int, y: Int) => x < y)(List(5, 7, 1, 3))
val intSort = msort((x: Int, y: Int) => x < y) _
val reverseIntSort = msort((x: Int, y: Int) => x > y) _
val mixedInts = List(4, 1, 9, 0, 5, 8, 3, 6, 2, 7)
intSort(mixedInts)
reverseIntSort(mixedInts)
