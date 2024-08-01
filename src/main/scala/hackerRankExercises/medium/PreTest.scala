package hackerRankExercises.medium

import hackerRankExercises.test.Test

import scala.io._



object Result {

  /*
   * Complete the 'fizzBuzz' function below.
   *
   * The function accepts INTEGER n as parameter.
   */

  def fizzBuzz(n: Int) {
    val numsToCheck = (1 to n).toList

    numsToCheck.foreach(e => e match {
      case e if ((e % 3) != 0 && (e % 5) != 0) => println(e)
      case e if ((e % 3) == 0 && (e % 5) != 0) => println("Fizz")
      case e if ((e % 3) != 0 && (e % 5) == 0) => println("Buzz")
      case e if ((e % 3) == 0 && (e % 5) == 0) => println("FizzBuzz")
    })
  }


}

