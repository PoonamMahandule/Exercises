
object GetOffMyLawn extends App {
  object Dad  {
    case class Film(name:String,director:String)
   def rate( film :Film) :Double= {
     film match {
       case  Film(_,"Clint Eastwood") => 10.0
       case  Film(_,"John McTiernan" ) => 7.0
       case _ => 3.0
     }
   }
 }
  println(Dad.rate(Dad.Film("Critic","Clint Eastwood")))
  println(Dad.rate(Dad.Film("Critic","John McTiernan")))
  println(Dad.rate(Dad.Film("Critic","abc")))
}
