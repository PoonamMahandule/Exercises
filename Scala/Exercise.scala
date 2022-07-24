package com.springer
import scala.io.StdIn.readLine
object Exercise extends App {
  while(true) {
    println("Enter String:")
    println(patternMatching(readLine()))

    def patternMatching(expr: String):Unit =
      expr match {
        case "Hii" => "Hii"
        case "Hello" => "Hello"
        case _ => System.exit(0)
      }
  }
}
