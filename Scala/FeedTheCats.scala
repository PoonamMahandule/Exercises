object FeedTheCats extends App{
  case class Cat( color: String, food:String)
  object ChipShop {
    def willServe(cat :Cat):Boolean = {
       cat match {
         case Cat(_,"chips") => true
         case Cat(_,_) => false
       }
    }
  }

   val cats=Cat("white","chips")
  val cats2=Cat("Brown","Chocolates")
    println(ChipShop.willServe(cats))
    println(ChipShop.willServe(cats2))
}
