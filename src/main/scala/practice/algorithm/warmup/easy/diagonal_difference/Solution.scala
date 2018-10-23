package practice.algorithm.warmup.easy.diagonal_difference

import java.io._

object Solution {

  // Complete the diagonalDifference function below.
  def diagonalDifference(arr: Array[Array[Int]]): Int = {
    var d1 = 0
    var d2 = 0

    for(i <- arr.indices){
      d1 += arr(i)(i)
      d2 += arr(i)(arr.length - i - 1)
    }
    Math.abs(d1-d2)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(System.out)

    val n = stdin.readLine.trim.toInt

    val arr = Array.ofDim[Int](n, n)

    for (i <- 0 until n) {
      arr(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    val result = diagonalDifference(arr)

    printWriter.println(result)

    printWriter.close()
  }
}
