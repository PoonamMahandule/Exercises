object CatExercise extends App{
  class Cat(val color:String,val food: String)

  val oswald = new Cat("Black","Milk")
  val henderson = new Cat("Ginger" ,"Chips")
  val Quentin = new Cat ("Tabby and white","Curry")

  object ChipShop {
    def willServe( c:Cat) :Boolean= {
      if(c.food == "Chips") true
      else false
    }
  }
  println(ChipShop.willServe(oswald))
  println(ChipShop.willServe(henderson))

}
