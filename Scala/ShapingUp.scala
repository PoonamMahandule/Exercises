/*
The solution from the last exercise delivered three dis􏰀nct types of shape. However, it doesn’t model the relationships between the three correctly. A Square isn’t just a Shape—it’s also a type of Rectangle where the width and height are the same.
Refactor the solution to the last exercise so that Square and Rectangle are subtypes of a common type Rectangular.
Tip: A trait can extend another trait.
*/

trait Shape{
  def side : Int
  def perimeter:Double
  def area:Double
}
case class Circle(radius:Double) extends Shape{
  override def side: Int = 1
  override def perimeter: Double = 2 * math.Pi * radius
  override def area :Double = math.Pi * radius * radius
}
sealed trait Rectangular extends Shape{
  val width:Double
  val height:Double
  val sides:Int = 4
  override def perimeter: Double = 2 *( width + height)
  override def area: Double = width * height

}
case class Rectangle(width: Double,height:Double) extends Rectangular {
/*  override def side :Int = 1
  override def perimeter: Double = 2 * (height + width)
  override def area: Double = height * width
*/
  override def side: Int = 4
}
case class Square(size:Double) extends Rectangular {
/*  override def side: Int = 4
  override def perimeter: Double = 4 * size
  override def area: Double = width * height
*/
  override val width: Double = size
  override val height: Double = size
  override def side: Int = 4
}

object ShapingUp extends App{
  println("Perimeter of Square " +Square(45.0).perimeter)
  println("Area of Square " +Square(45.0).area)
  println("Perimeter of Rectangle "+ Rectangle(45.6,87.9).perimeter)
  println("Area of Rectangle "+ Rectangle(45.6,87.9).area)

}
