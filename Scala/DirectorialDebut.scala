object DirectorialDebut extends App{
  class Director(val firstName:String,val lastName:String,val yearOfBirth:Int){
    def name():String = {
    firstName + " " + lastName
    }
  }

   val dir = new Director("poonam","mahandule",1999)
    println(dir.name())

   class Film(val name:String,val yearOfRelease:Int,val imdbRating:Double,val director:Director){
     def directorsAge():Int={
       yearOfRelease - director.yearOfBirth
     }
     def isDirectedBy(dir:Director):Boolean = {
      if( dir.firstName == "poonam")
        true
      else
        false
     }
   }
  val film= new Film("Mother India",2022,4.2,dir)
 println( film.directorsAge())
  println(film.isDirectedBy(dir))

}
