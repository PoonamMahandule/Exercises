package com.springer

object PatternMatchingExercise extends App{
       println("Enter String value")
       val result2 = scala.io.StdIn.readLine()

        val d:PartialFunction[String,Unit] = new PartialFunction[String,Unit]{
          override def isDefinedAt(result2: String):Boolean  =  result2 == "Hii" || result2 == "Hello"

          override def apply(result2: String): Unit= {
            result2 match {
              case "Hii" => println("Entered String is Hii")
              case "Hello" =>println("Entered String is Hello")
              case _ => System.exit(0)
            }
          }
        }
      println(d.apply(result2))

}
