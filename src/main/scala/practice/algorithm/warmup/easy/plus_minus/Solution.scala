package practice.algorithm.warmup.easy.plus_minus

import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

  // Complete the plusMinus function below.
  def plusMinus(arr: Array[Int]) {
    val l = arr.length
    var p = 0
    var n = 0
    var z = 0
    arr.foreach(x => {
      if(x > 0) p += 1
      else if(x < 0) n += 1
      else z += 1
    })
    println(p.toFloat/l)
    println(n.toFloat/l)
    println(z.toFloat/l)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    plusMinus(arr)
  }
}
