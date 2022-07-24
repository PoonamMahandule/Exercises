
/*
* Define a trait called Shape and give it three abstract methods:
• sides returns the number of sides;
• perimeter returns the total length of the sides; • area returns the area.
Implement Shape with three classes: Circle, Rectangle, and Square. In each case provide implementa􏰀ons of each of the three methods. Ensure that the main constructor parameters of each shape (e.g. the radius of the circle) are accessible as fields.
Tip: The value of π is accessible as math.Pi.
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
case class Rectangle(length:Double,width: Double) extends Shape{
  override def side :Int = 1
  override def perimeter: Double = 2 * (length + width)
  override def area: Double = length * width
}
case class Square(size:Double) extends Shape {
  override def side: Int = 4
  override def perimeter: Double = 4 * size
  override def area: Double = size * size
}


