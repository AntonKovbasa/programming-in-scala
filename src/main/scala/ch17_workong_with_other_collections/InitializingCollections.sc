List(1, 2, 3)
Set('a', 'b', 'c')
import scala.collection.immutable.TreeSet
import scala.collection.mutable
mutable.Map("hi" -> 2, "there" -> 5)
Array(1.0, 2.0, 3.0)

val stuff = mutable.Set[Any](42)
stuff += "abracadabra"

val colors = List("blue", "yellow", "red", "green")
val treeSet = TreeSet[String]() ++ colors

treeSet.toList
treeSet.toArray

val mutaSet = mutable.Set.empty ++= treeSet
val immutaSet = Set.empty ++ mutaSet

val muta = mutable.Map("i" -> 1, "ii" -> 2)
val immu = Map.empty ++ muta


