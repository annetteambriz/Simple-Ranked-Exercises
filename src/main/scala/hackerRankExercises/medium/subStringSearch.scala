package hackerRankExercises.medium

import scala.collection.mutable.ListBuffer

object subStringSearch {
  def constructPartialMatchList(pattern: String): ListBuffer[Int]= {
    val pml = ListBuffer.fill(pattern.length)(0)
    val curr = 1
    val patternList = pattern.toList

    patternList.zipWithIndex.collect{
      case (elem, index) if index > 0 =>
        elem match {
          case elem if (elem == patternList(index - 1) && pml(index - 1) != 0) => {
            val pmlValue = pml(index - 1) + 1
            pml(index) = pmlValue
            println(pml)
          }
          case elem if (elem == patternList(index - 1) && pml(index - 1) == 0) => {
            pml(index) = 1
          }
          case elem if (elem != patternList(index-1)) => {
            pml(index) = 0
          }
        }
      }
    pml
  }

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
  }
}
