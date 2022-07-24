object GreetingHuman extends App{

object Person {
  val firstName: String = "Poonam"
  val lastName: String = "Mahandule"
}
  object Alien {
    def greet (p:Person.type ) :String =
     "Greetings "+ p.firstName
  }
  println(Alien.greet(Person))
}
