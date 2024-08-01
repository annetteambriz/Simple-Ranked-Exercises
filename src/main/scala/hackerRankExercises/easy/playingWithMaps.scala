package hackerRankExercises.easy

object playingWithMaps {

  def mapIt(nums: List[Int]): Unit = {
    val xs = nums.map { x =>
        List(x, 2 * x, 3 * x)
      }
    println(xs)
  }
}
