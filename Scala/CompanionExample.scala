class CompanionExample(name:String,age:Int){
def greet():String= s"Hello,My name is $name and age is $age old.Do I like vegitables? ${CompanionExample.Likes_Vegitables}"
}
object CompanionExample extends App{ //companion object =>for static fields and methods
  private val Likes_Vegitables : Boolean = true

  println(CompanionExample.Likes_Vegitables)
  val obj=new CompanionExample("abc",23)
  println(obj.greet())
}
