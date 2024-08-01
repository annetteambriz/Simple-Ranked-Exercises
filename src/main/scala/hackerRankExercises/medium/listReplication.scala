package hackerRankExercises.medium

object listReplication {
  def replicateList(num: Int, arr: List[Int]): List[Int] = {
    val replicated = arr.flatMap(e => List.fill(num)(e))
    replicated
  }
  def fillList(num: Int) = {
    // fill with range
    println("Fill with Range: " + (1 to num).toList)

    //or fill with num
    println("Fill with Fill and num: " + List.fill(num)(num))

    //or fill with range
    println("Fill with Fill and Range: " + List.fill(num)((1 to num).toList))
  }
}
