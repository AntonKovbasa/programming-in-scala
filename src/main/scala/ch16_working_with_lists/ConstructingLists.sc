val fruit = "apples" :: "oranges" :: "pears" :: Nil
val diag3 = (1 :: 0 :: 0 :: Nil) ::
  (0 :: 1 :: 0 :: Nil) ::
  (0 :: 0 :: 1 :: Nil) :: Nil
val empty = Nil

empty.isEmpty
fruit.isEmpty
fruit.head
fruit.tail.head
diag3.head


def isort(xs: List[Int]): List[Int] =
  if (xs.isEmpty) Nil
  else insert(xs.head, isort(xs.tail))
def insert(x: Int, xs: List[Int]): List[Int] =
  if (xs.isEmpty || x <= xs.head) x :: xs
  else xs.head :: insert(x, xs.tail)