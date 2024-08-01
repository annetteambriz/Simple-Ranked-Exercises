package hackerRankExercises.medium

object Reverse {
  def reverse[A](arr:List[A]): List[A] = {
    def helperReverse[A](original: List[A], reversed: List[A]): List[A] = {
      original match {
        case Nil => reversed
        case head :: tail => helperReverse(tail, head :: reversed)
      }
    }
    helperReverse(arr, List())
  }
}
