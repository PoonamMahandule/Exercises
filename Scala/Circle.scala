object Circle extends App{
  class Circle(val radius:Double){
    def getArea():Double = {
      3.14 * radius * radius
    }
  }
  val a = new Circle(10.5).getArea()
  println("Area of Circle = " +a)

  class Square(val side:Double){
    def getArea():Double ={
      side * side
    }
  }
  class Cube(val edge:Double){
    def getArea():Double = {
      6 * edge * edge
    }
  }
  println("Area of Cube = "+ new Cube(4.0).getArea())
 println( " Area of Square = " +new Square(23.98).getArea())

}
