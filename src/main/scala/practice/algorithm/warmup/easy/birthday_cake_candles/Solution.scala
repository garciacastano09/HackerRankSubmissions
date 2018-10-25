package practice.algorithm.warmup.easy.birthday_cake_candles

import java.io._

object Solution {

  // Complete the birthdayCakeCandles function below.
  def birthdayCakeCandles(ar: Array[Int]): Int = {
    val x = ar.max
    ar.count(_ == x)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(System.out)

    val arCount = stdin.readLine.trim.toInt

    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = birthdayCakeCandles(ar)

    printWriter.println(result)

    printWriter.close()
  }
}
