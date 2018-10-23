package practice.algorithm.warmup.easy.staircase


object Solution {

    // Complete the staircase function below.
    def staircase(n: Int) {
        (1 to n).foreach(x => println(" "*(n - x) + "#"*x))
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        staircase(n)
    }
}