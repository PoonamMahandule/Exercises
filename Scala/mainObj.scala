package com.springer

object mainObj extends App{
  //refernce Tranference:Return same value
  //pure function
  //total function..:always
  //side effects:function not in our control..read from file..not predict output:Impure function
  def sum(a :Int,b:Int):Int ={
    a + b
  }
  val x : Int  = sum(10,20)
  println(x)
  //lamda function//annoymous function
  val doubler :Int => Int = (v1 :Int) => v1 * 2 //int arrow int
  println(doubler)

  //Square of number
  val Square :Int =>Int =(num:Int) => num * num
  println("Square of number  " +Square(10))

  //sum of number
  val sum = (n1:Int,n2:Int,n3:Int,n4:Int)  => n1+n2+n3+n4
  println(sum(12,87,89,98))

//First Class Function=function can pass to other function
  val example :Function[Int,Int]= new Function[Int,Int] {
    override def apply(v1: Int): Int = v1 * 2
  }
  println(example)
//Function composistion
//  private val sumOfAll :Function4[Int,Int,Int,Int] = new Function[Int,Int,Int,Int]{
//
//  }

 def operationOf12(f:Int => Int):Unit = println("Give me a result  " +f(12))
  //code resusability
  operationOf12(doubler)
  operationOf12(Square)
//assign object to diiferent value
  val assignValue:Int =>Int = doubler
  //higher order function:Takes input as a function
  //first class function:can be pass
  //
  //def dounler():Int = (num:Int) =>  num * 2

  //partical function = which handle only certain function
 // val d:PartialFunction[Int,Int] = new PartialFunction[Int,Int]{
//    override def isDefinedAt(x: Int): Boolean = ???
//
//    override def apply(v1: Int): Int = ???
//    case x if (x % 3 == 0 => x * 3)
//  }
//  //pattern class
//  val x=3
//  x match {
//    case 10 {
//
//  }
//    case if(x >3)==0=> x*3
  //}
}
