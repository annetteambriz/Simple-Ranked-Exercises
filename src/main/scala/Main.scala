import hackerRankExercises.easy.filterOnN.{indicesOfFruit, oddSum, removeOddPosition}
import hackerRankExercises.medium.listReplication.fillList
import hackerRankExercises.medium.Reverse.reverse
import hackerRankExercises.easy.{filterOnN, myFavoriteNumbers, playingWithMaps}
import hackerRankExercises.medium.{Reverse, listReplication, otherSuperDigit, subStringSearch, superDigit}
import hackerRankExercises.test.Test

object Main {
  def main(args: Array[String]): Unit = {
    //println(listReplication.replicateList(3, List(1,2,3,4)))
    //println(filterOnN.filter(3, List(1, 2, 3, 4, 5)))
    //println(removeOddPosition(List(0, 1, 2, 3, 4, 5)))
    //println(indicesOfFruit("apple", List("apple", "banana", "cherry", "apple")))
    //println(reverse(List("A", "B", "C")))
    //println(oddSum(List(0, 1, 2, 3)))
    //println(superDigit.find(9875))
    //println(superDigit.findWithNK(148, 3))
    //println("123".*(5))
    //println(List.fill(5)("148"))
    //val input = otherSuperDigit.generateInt("148", "3")
    //println(otherSuperDigit.find(input))

//    println(subStringSearch.constructPartialMatchList("ABABCABAB"))
//    val input = io.Source.stdin.getLines()
//    println(Test.numPlayers(3, Array(100, 50, 50, 25)))
//    println("New case")
//    println(Test.numPlayers(4, Array(2, 3, 3, 4, 5)))
    val someNumbers: List[Int] = List(1, 99, 75, 21)
    val someOtherNumbers: List[Option[Int]] = List(Some(110), Some(99), None, Some(75), Some(666), None)
    val anyStuff: List[Any] = List(234, 445, 776, 232, 1, 99, 75, 21, "Roses are red", "Scala")

    //println(myFavoriteNumbers.findMyFavoriteNumbers(someOtherNumbers))
    println(myFavoriteNumbers.findMyFavoriteNumbersAndReturn(someOtherNumbers))
    //playingWithMaps.mapIt(someNumbers)
  }
}
