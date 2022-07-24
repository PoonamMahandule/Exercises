
object CaseClassExample extends App {
  case class Employee(name:String,id:Int)
  val developer = new Employee("abc",101)
  val developer1 = new Employee("abc",101)
  println(developer)
  print(developer.name)
  //if we remove case keyword it will print hash code
  println(developer == developer1) //true
}
