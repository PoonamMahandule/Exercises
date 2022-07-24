package com.springer

object PracticeExample extends App {

    // defining a value
    val int42: Int = 42
    var var12 = 12
    var12 = 12

    // Int, Boolean, Char, Double, Float, String
    val aBoolean = false // type is optional

    // strings and string operations
    val aString = "I love Scala"
    val aComposedString = "I" + " " + "love" + " " + "Scala"
    val anInterpolatedString = s"The meaning of life is ${var12.*(12)}"
    println(aString)
    println(aComposedString)
    println(anInterpolatedString)


    // expressions = structures that can be reduced to a value
    val anExpression = 2 + 3

    // if-expression
    val ifExpression =
      if (int42 > 43) 56 else 999

    val chainedIfExpression =
      if (int42 > 43) 56
      else if (int42 < 0) -2
      else if (int42 > 999) 78
      else 0

    // code blocks
    val aLocalValue = 67
    val aCodeBlock: Int = {
      aLocalValue + 3
      // definitions

      // value of block is the value of the last expression

    }
    // define a function / method
    def myFunction(x: Int, y: String): String = {
      val a = 12
      y + " " + x
    }
    val a: Unit = ()
    // recursive functions
    def factorial(n: Int): Int =
      if (n <= 1) 1
      else n * factorial(n - 1)

    // In Scala we don't use loops or iteration, we use RECURSION!

    // the Unit type = no meaningful value === "void" in other languages
    // type of SIDE EFFECTS

    def myUnitReturningFunction(): Unit = {
      println("I don't love returning Unit")
    }

    val theUnit = ()


}
