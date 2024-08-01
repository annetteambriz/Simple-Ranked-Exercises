package hackerRankExercises.medium

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
