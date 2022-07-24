object Order_Of_Evaluation extends App{
  object argh {
    def a = {
      println("a")
      1
    }
    val b = {
      println("b")
      a + 2
    }

    def c = {
      println("c")
      a
      b + "c"
    }

  }
  println(argh.a + argh.b + argh.c)

}
