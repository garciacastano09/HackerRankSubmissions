package practice.algorithm.implementation.medium.forming_a_magic_square

import java.io._

object Solution {

  // Complete the formingMagicSquare function below.
  val POSSIBLE_MATRIXES: Array[Array[Array[Int]]] = Array(
    Array(Array(8,1,6),
          Array(3,5,7),
          Array(4,9,2)),
    Array(Array(6,1,8),
          Array(7,5,3),
          Array(2,9,4)),
    Array(Array(4,9,2),
          Array(3,5,7),
          Array(8,1,6)),
    Array(Array(2,9,4),
          Array(7,5,3),
          Array(6,1,8)),
    Array(Array(8,3,4),
          Array(1,5,9),
          Array(6,7,2)),
    Array(Array(4,3,8),
          Array(9,5,1),
          Array(2,7,6)),
    Array(Array(6,7,2),
          Array(1,5,9),
          Array(8,3,4)),
    Array(Array(2,7,6),
          Array(9,5,1),
          Array(4,3,8))
  )

  def formingMagicSquare(candidate: Array[Array[Int]]): Int = {
    POSSIBLE_MATRIXES
      .map(model => model.flatten.indices
      .map(i => {
        val m = model.flatten
        val c = candidate.flatten
        Math.abs(m(i) - c(i))
      }).sum
    ).min
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(System.out)

    val s = Array.ofDim[Int](3, 3)

    for (i <- 0 until 3) {
      s(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    val result = formingMagicSquare(s)

    printWriter.println(result)

    printWriter.close()
  }
}

