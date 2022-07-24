
 class Person(val name:String ,val age:Int ){
  require(name != null && age > 20)
}

object Person {
  def apply(name: String, age: Int) =
    if (name.nonEmpty && age > 20) new Person(name, age) else null

  def unapply(p: Person): Option[(String, Int)] = Some(p.name,p.age)
}
object Stormtrooper {
  def inspect(person: Person): String =
    person match {
      case Person("Luke", 98) => "Stop, rebel scum!"
      case Person("Han", 87) => "Stop, rebel scum!"
      case Person(first, 98) => s"Move along, $first"
    }

  val aNumber = 44
  val ordinal = aNumber match {
    case 1 => "first"
    case 2 => "second"
    case 3 => "third"
    case _ => aNumber + "th" // ignore the English grammar will you please
  }

  object Exercise extends App {
    val person = new Person(name = "Luke", 98)
    println(person)
    println(Stormtrooper.inspect(person))
  }
}
//oad

