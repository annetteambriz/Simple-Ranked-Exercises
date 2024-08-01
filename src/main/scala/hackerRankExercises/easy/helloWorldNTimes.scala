package hackerRankExercises.easy

object helloWorldNTimes {

  def printNTimes(n: Int): Unit = {
    val message = "Hello World"
    val nList = 1 to n

    nList.foreach(_ => {
      println(message)
    })
  }
}
