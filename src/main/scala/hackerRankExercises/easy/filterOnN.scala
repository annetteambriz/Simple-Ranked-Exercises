package hackerRankExercises.easy

object filterOnN {
  def filter(n: Int, arr: List[Int]): List[Int] = {
    arr.filter(_ < n)
  }
  def removeOddPosition(arr: List[Int]): List[Int] = {
    //arr.filter(arr.indexOf(_) % 2 != 0)
    arr.zipWithIndex.collect({
      case (elem, index) if index % 2 == 0 => elem
    })
  }

  def indicesOfFruit(fruit: String, fruits: List[String])= {
    //val fruits = List("apple", "banana", "cherry", "apple")

    val indicesOfFruit = fruits.zipWithIndex.collect {
      case (elem, index) if elem == fruit => Map(elem -> index)
    }
    indicesOfFruit
  }

  def oddSum(arr: List[Int]): Int = {
    val oddList = arr.zipWithIndex.collect({
      case (elem, index) if (elem % 2 )!= 0 => elem
    })
    oddList.sum
  }
}
