package hackerRankExercises.medium


/**
 *
 * We define super digit of an integer X using the following rules:
 * If X has only 1 digit, then its super digit is X.
 * Otherwise, the super digit of X is equal to the super digit of the digit-sum of X.
 * Here, digit-sum of a number is defined as the sum of its digits.
 * For example, super digit of  will be calculated as:
 *
 * super_digit(9875)  super_digit(9+8+7+5)
 *                 = super_digit(29)
 *                 = super_digit(2+9)
 *                 = super_digit(11)
 *                 = super_digit(1+1)
 *                 = super_digit(2)
 *                 = 2
 */

object superDigit {
  def find(num: Int): Int = {
    superDigitHelper(numAsList(num))
  }

  def findWithNK(n: Int, k: Int): Int = {
    superDigitHelper(generateInt(n, k))
  }

  def numAsList(num: Int): List[Int] = {
    num.toString.map(_.asDigit).toList
  }

  def superDigitHelper(arr: List[Int]): Int = {
    arr match {
      case (element :: Nil) => element
      case multiItemList => superDigitHelper(numAsList(arr.sum))
    }
  }

  def generateInt(n: Int, k: Int): List[Int] = {
    List.fill(k)(n)
  }

  def generateInt(n: String, k: String): List[Int] = {
    val nInt = n.toInt
    val kInt = k.toInt
    List.fill(kInt)(nInt)
  }

  def main(args: Array[String]): Unit = {
    val readIn = scala.io.StdIn.readLine()
    val inputList = readIn.split(" ").toList
    val n = inputList(0)
    val k = inputList(1)

    val input = generateInt(n, k)
    //println(find(input))
  }
}
