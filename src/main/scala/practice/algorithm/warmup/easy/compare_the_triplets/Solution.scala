package practice.algorithm.warmup.easy.compare_the_triplets

import java.io._
import scala.io._

object Solution {

  // Complete the compareTriplets function below.
  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {

    def loop(a: Array[Int], b: Array[Int], p: Array[Int]): Array[Int] = {
      if(a.isEmpty && b.isEmpty) {
        p
      }
      else{
        if (a.head > b.head){
          loop(a.tail, b.tail, Array(p(0) + 1, p(1)))
        }
        else if (a.head < b.head){
          loop(a.tail, b.tail, Array(p(0), p(1) + 1))
        }
        else {
          loop(a.tail, b.tail, Array(p(0), p(1)))
        }
      }
    }
    loop(a, b, Array(0, 0))

  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val result = compareTriplets(a, b)

    printWriter.println(result.mkString(" "))

    printWriter.close()
  }
}
