/*
First make Shape a sealed trait. Then write a singleton object called Draw with an apply method that takes a Shape as an argument and returns a descrip􏰀on of it on the console.
 */
object PrintingShaps2{
  sealed trait Shape{
    def side : Int
    def perimeter:Double
    def area:Double
  }

  case class Circle(radius:Double) extends Shape
  {
    override def side: Int = 1
    override def perimeter: Double = 2 * math.Pi * radius
    override def area :Double = math.Pi * radius * radius
  }
  case class Rectangle(height:Double,width: Double) extends Shape
  {
    override def side :Int = 1
    override def perimeter: Double = 2 * (height + width)
    override def area: Double = height * width
  }
  case class Square(size:Double) extends Shape
   {
    override def side: Int = 4
    override def perimeter: Double = 4 * size
    override def area: Double = size * size
  }
  object Draw
  {
    def apply(shape: Shape): String = {
      shape match {
        case Rectangle(width, height) =>
          s"A rectangle of width ${width} cm and height ${height} cm"
        case Square(size) =>
          s"A square of size ${size} cm"
        case Circle(radius) =>
          s"A circle of radius ${radius} cm"

      }
    }
  }
  def main(args: Array[String]): Unit =
  {
    println(Draw.apply(new Circle(10.0)))
    println(Draw.apply(new Rectangle(12.9, 12.8)))
    println(Draw.apply(new Square(45.87)))


  }

}

