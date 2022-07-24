object CaseClassExercise extends App{
  case class Employee(name:String,empId:Int)
//if we remove case keyword then emp object will print hashcode of emp object
  val emp = new Employee("Poonam",123)
  println(emp.toString)
  println(emp)


  val emp1 = new Employee("Poonam",123)
  println(emp == emp1)

  val emp2 = new Employee("Komal",123)
  println(emp2 == emp1)


}
