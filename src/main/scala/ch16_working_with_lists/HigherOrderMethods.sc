List(1, 2, 3) map (_ + 1)
val words = List("the", "quick", "brown", "fox")
words map (_.length)
words map (_.reverse.mkString)

words map (_.toList)
words flatMap (_.toList)
List.range(1, 5) flatMap (
  i => List.range(1, i) map (j => (i, j))
  )
for (i <- List.range(1, 5); j <- List.range(1, i)) yield (i, j)

var sum = 0
List(1, 2, 3, 4, 5) foreach (sum += _)
sum

List(1, 2, 3, 4, 5) filter (_ % 2 == 0)
words filter (_.length == 3)

List(1, 2, 3, 4, 5) partition (_ % 2 == 0)
words partition (_.length == 3)

List(1, 2, 3, 4, 5) find (_ % 2 == 0)
List(1, 2, 3, 4, 5) find (_ <= 0)


List(1, 2, 3, -4, 5) takeWhile (_ > 0)
words dropWhile (_ startsWith "t")

List(1, 2, 3, -4, 5) span (_ > 0)

def hasZeroRow(m: List[List[Int]]) =
  m exists (row => row forall (_ == 0))

def sum(xs: List[Int]): Int = (0 /: xs) (_ + _)
def product(xs: List[Int]): Int = (1 /: xs) (_ * _)
("" /: words) (_ + " " + _)
(words.head /: words.tail) (_ + " " + _)

def flattenLeft[T](xss: List[List[T]]) =
  (List[T]() /: xss) (_ ::: _)
def flattenRight[T](xss: List[List[T]]) =
  (xss :\ List[T]()) (_ ::: _)

List(1, -3, 4, 2, 6) sortWith (_ < _)
words sortWith (_.length > _.length)


(List(10, 20), List(3, 4, 5)).zipped.map(_ * _)
(List("abc", "de"), List(3,2)).zipped.forall(_.length == _)
(List("abc", "de"), List(3, 2)).zipped.exists(_.length != _


