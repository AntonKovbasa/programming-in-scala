var more = 1
val addMore = (x: Int) => x + more
addMore(5)
more = 10
addMore(5)

val someNumbers = List(-11, -10, -5, 0, 5, 10)
var sum = 0
someNumbers.foreach((x: Int) => sum += x)
sum

def makeIncreaser(more: Int) = (x: Int) => x + more
val inc1 = makeIncreaser(1)
val inc9999 = makeIncreaser(9999)
inc1(10)
inc9999(10)
