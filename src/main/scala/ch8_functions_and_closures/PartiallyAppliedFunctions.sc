val someNumbers = List(-10, -5, 0, 5, 10)
someNumbers.foreach(print _)

def sum(a: Int, b: Int, c: Int) = a + b + c
sum(1, 2, 3)

val a = sum _
a(1,2,3)

val b = sum(1, _: Int, 3)
b(2)
