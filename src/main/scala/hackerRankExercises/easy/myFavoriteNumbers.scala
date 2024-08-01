package hackerRankExercises.easy

object myFavoriteNumbers {

  case class Fruit()
  case class Plant()

  def findMyFavoriteNumbers(nums: List[Option[Int]]): Unit = {
    nums.map(x => x match {
      case Some(x) if x >= 100 => println(s"I love number ${x}")
      case Some(x) if x < 100 => println(s"I hate number ${x}")
      case None => println(s"$x ain't a number")
    })
  }

  def findMyFavoriteNumbersAndReturn(nums: List[Option[Int]]): List[String] = {
    nums.map(x => x match {
      case Some(x) if x >= 100 => s"I love number ${x}"
      case Some(x) if x < 100 => s"I hate number ${x}"
      case None => s"$x ain't a number"
    })
  }
}
