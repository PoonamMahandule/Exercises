object FriendlyPersonFactory extends App {
  class Person(val fName: String, val lName: String) {
    def fullName: String = s"$fName $lName"
  }
  object Person {
    def apply(fullName: String): Person = {
      val parts = fullName.split(" ")
      new Person(parts(0), parts(1))
    }
  }

  println("First name is "+Person("abc pqr").fName)
  println("last name is "+Person("abc pqr").lName)



}
