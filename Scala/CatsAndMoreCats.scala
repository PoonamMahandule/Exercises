/**
 * Demand for Cat Simulator 1.0 is exploding! For v2 we’re going to go beyond the domes􏰀c cat to model Tigers, Lions, and Panthers in addi􏰀on to the Cat. Define a trait Feline and then define all the different species as subtypes of Feline. To make things interes􏰀ng, define:
• onFelineacolourasbefore;
• onFelineaStringsound,whichforacatis"meow"andis"roar"
for all other felines;
• onlyCathasafavouritefood;and
• Lions have an Int maneSize.
 */

trait Feline {
  def colour: String
  def sound: String
}
case class Lion(colour: String, maneSize: Int) extends Feline {
  val sound = "roar"
}
case class Tiger(colour: String) extends Feline {
  val sound = "roar"
}
case class Panther(colour: String) extends Feline {
  val sound = "roar"
}
case class Cat(colour: String, food: String) extends Feline {
  val sound = "meow"
}
object CatsAndMoreCats extends App{
  println(Cat("white","milk"))

}


//Lion,Tiger,Panther,Cat ==  sum type pattern
//colour,sound == product type pattern