package Tutorial8

import scala.io.StdIn.readInt
object Q02 {


    val PatternMatching = (num: Int) => {
      num match {
        case x if (x <= 0) => println("Negative or Zero")
        case x if (x % 2 == 0) => println("Even")
        case _ => println("Odd")
      }
    }
    def main(args: Array[String]): Unit = {
      println("Enter Number: ")
      val num = readInt()
      PatternMatching(num)

    }


}