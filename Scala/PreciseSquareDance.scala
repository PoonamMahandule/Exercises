object PreciseSquareDance {
  object calculator {
    def square(value: Double) = value * value
    def cube(value: Double) = value * square(value)
    def square(value: Int) = value * value
    def cube(value: Int) = value * square(value)
  }

  def main(args: Array[String]): Unit = {
    println(calculator.square(12.8))
    println(calculator.square(12))
  }

}
