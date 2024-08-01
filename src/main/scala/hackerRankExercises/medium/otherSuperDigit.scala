package hackerRankExercises.medium

object otherSuperDigit {

    def generateInt(n: String, k: String): String = {
      val kInt = k.toInt
      n * kInt
    }

    def sumStringNumList(numString: String): String = {
      numString.map(_.asDigit).sum.toString
    }

  def find(num: String): String = {
      def superDigitHelper(numString: String): String = {
        numString match {
          case numString if numString.length == 1 => numString
          case numString if numString.length > 1 => superDigitHelper(sumStringNumList(numString))
        }
      }
      superDigitHelper(num)
    }

    def main(args: Array[String]) {
      val readIn = scala.io.StdIn.readLine()
      val inputList = readIn.split(" ").toList
      val n = inputList(0)
      val k = inputList(1)

      val input = generateInt(n, k)
      println(find(input))
    }
}

