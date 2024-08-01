package hackerRankExercises.test
import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._



object Test {

  /*
   * Complete the 'numPlayers' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER k
   *  2. INTEGER_ARRAY scores
   *
   *  k = 4
   *  scores = [200, 200, 300, 400, 500]
   *  rank = [4, 4, 3, 2, 1]
   *
   *  scores = [100, 50, 50, 25]
   *  rank = [1, 2, 2, 4]
   *
   * Algo:
   *  Sort scores in descending order
   *  zipWithIndex = [(0,100), (1,50) (2,50), (3,25)]
   *  Iterate through tuples, currentIndex and val curr = index + 1
   *  rankArray(currentIndex) = curr
   *
   * Filter rank array by k. >= k
   *
   */

  def numPlayers(k: Int, scores: Array[Int]): Int = {
    val ranks = ListBuffer[Int]()
    val scoresSort = scores.sortWith(_ > _)
    val zipScores = scores.zipWithIndex.toList
    println(zipScores)

    zipScores.foreach( e => {
      val value = e._1
      val index = e._2
      //first score
      val rank = if (index == 0) {
        1
      } else {
        //rest of scores
        val preValue = zipScores(index - 1)._1
        if (value == preValue) ranks.last
        else index + 1
      }
      ranks += rank
    })
    println(ranks)
    ranks.count(_ <= k)
  }
}
