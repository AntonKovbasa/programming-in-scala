def isGoodEnough(guess: Double): Boolean = {
  false
}

def improve(guess: Double): Double = {
  1.0
}

@scala.annotation.tailrec
def approximate(guess: Double): Double =
  if (isGoodEnough(guess)) guess
  else approximate(improve(guess))


def boom(x: Int): Int =
  if (x == 0) throw new Exception("boom!") else boom(x - 1) + 1
//boom(3)


def bang(x: Int): Int =
  if (x == 0) throw new Exception("bang!") else bang(x - 1)
//bang(3)

def isEven(x: Int): Boolean =
  if (x == 0) true else isOdd(x - 1)

def isOdd(x: Int): Boolean =
  if (x == 0) false else isEven(x - 1)

val funValue = nestedFun _
def nestedFun(x: Int) : Unit = {
  if (x != 0) { println(x); funValue(x - 1) }
}
funValue(5)


