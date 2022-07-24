object Square_Dance extends App{
  object calc {
    def square(num: Double): Double = {
      num * num
    }
    def cube (num:Double)  = {
        num * square(num)
    }
    def square(num: Int): Double = {
      num * num
    }
    def cube (num:Int)  = {
      num * square(num)
    }
  }
  println(calc.square(2.2))
  println(calc.cube(2.5))
  println(calc.square(2))
  println(calc.square(2))

}
