val text = "See Spot run. Run, Spot. Run!"
val wordsArray = text.split("[ !,.]+")
val words = scala.collection.mutable.Set.empty[String]
for (word <- wordsArray)
  words += word.toLowerCase
words

val nums = Set(1, 2, 3) //Creates an immutable set (nums.toString returnsSet(1, 2, 3))
nums + 5 //Adds an element (returns Set(1, 2, 3, 5))
nums - 3 //Removes an element (returns Set(1, 2))
nums ++ List(5, 6) //Adds multiple elements (returns Set(1, 2, 3, 5, 6))
nums -- List(1, 2) //Removes multiple elements (returns Set(3))
nums & Set(1, 3, 5, 7) //Takes the intersection of two sets (returns Set(1, 3))
nums.size //Returns the size of the set (returns 3)
nums.contains(3) //Checks for inclusion (returns true)

import scala.collection.immutable.{TreeMap, TreeSet}
import scala.collection.mutable //Makes the mutable collections easy to access
val words1 = mutable.Set.empty[String] //Creates an empty, mutable set (words.toString returnsSet())
words1 += "the" //Adds an element (words.toString returns Set(the))
words1 -= "the" //Removes an element, if it exists (words.toStringreturns Set())
words1 ++= List("do", "re", "mi") //Adds multiple elements (words.toString returnsSet(do, re, mi))
words1 --= List("do", "re") //Removes multiple elements (words.toString returnsSet(mi))
words.clear //Removes all elements (words.toString returns Set())


val map = mutable.Map.empty[String, Int]
map("hello") = 1
map("there") = 2
map
map("hello")
def countWords(text: String) = {
  val counts = mutable.Map.empty[String, Int]
  for (rawWord <- text.split("[ ,!.]+")) {
    val word = rawWord.toLowerCase
    val oldCount =
      if (counts.contains(word)) counts(word)
      else 0
    counts += (word -> (oldCount + 1))
  }
  counts
}

val nums1 = Map("i" -> 1, "ii" -> 2) //Creates an immutable map (nums.toString returnsMap(i -> 1, ii - > 2))
nums1 + ("vi" -> 6) //Adds an entry (returns Map(i -> 1, ii -> 2, vi -> 6))
nums1 - "ii" //Removes an entry (returns Map(i -> 1))
nums1 ++ List("iii" -> 3, "v" -> 5) //Adds multiple entries (returns Map(i -> 1, ii -> 2, iii -> 3, v -> 5))
nums1 -- List("i", "ii") //Removes multiple entries (returns Map())
nums1.size //Returns the size of the map (returns 2)
nums1.contains("ii") // Checks for inclusion (returns true)
nums1("ii") //Retrieves the value at a specified key (returns 2)
nums1.keys //Returns the keys (returns an Iterable over the strings"i" and "ii")
nums1.keySet //Returns the keys as a set (returns Set(i, ii))
nums1.values //Returns the values (returns an Iterable over the integers 1 and 2)
nums1.isEmpty //Indicates whether the map is empty (returns false)

import scala.collection.mutable //Makes the mutable collections easy to access
val words2 = mutable.Map.empty[String, Int] //Creates an empty, mutable map
words2 += ("one" -> 1) //Adds a map entry from "one" to 1 (words.toStringreturns Map(one - > 1))
words2 -= "one" //Removes a map entry, if it exists (words.toStringreturns Map())
words2 ++= List("one" -> 1, "two" -> 2, "three" -> 3) //Adds multiple map entries (words.toString returnsMap(one - >1,two->2,three->3))
words2 --= List("one", "two") //Removes multiple objects (words.toString returnsMap(three -> 3))


val ts = TreeSet(9, 3, 1, 8, 0, 2, 7, 4, 6, 5)
val cs = TreeSet('f', 'u', 'n')

var tm = TreeMap(3 -> 'x', 1 -> 'x', 4 -> 'x')
tm += (2 -> 'x')
tm