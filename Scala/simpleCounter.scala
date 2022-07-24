
/* Implement a Counter class. The constructor should take an Int.
 The meth- ods inc and dec should increment and decrement the counter respectively returning a new Counter.
 Here’s an example of the usage:*/
object simpleCounter extends App{

  class Counter(val num:Int){
   def inc () = new Counter(num + 1)
   def dec () =new Counter( num - 1)
  }

    val result =new Counter (10).inc().dec().dec()
  println(result.num)
}
