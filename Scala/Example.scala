package com.springer

class Person{
  val a = 10

}
object Example extends Person {

  //def main(args: Array[String]): Unit = {
    println("Hello")
  //}
//application trait
def main(args: Array[String]): Unit = {
 // val b = new Person()
 // b.a = 98

   val a = 78
 println("value of a" +a)
  //
  val num = 90
  val sum = 10 + 60 + "poo"
  println(sum)

  val int42 = 34
  val chainedIfExpression = {
    if(int42 > 43) 87
    else if (int42 > 32) 22
    else 0
  }

  println(chainedIfExpression)
  val scope :Int = {
    val a= 10
    val b = a + 10
    a + 90
  }
  //println(scope.b)
//println("Scope" +scope)

}
}
