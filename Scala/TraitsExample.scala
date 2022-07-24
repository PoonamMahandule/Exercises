
import java.util.Date

trait Visitor {
    def id:Int
    def createdAt:Date
    def age: Long = new Date().getTime - createdAt.getTime
  }
case class Anonymous(id:Int,createdAt:Date =new Date()) extends Visitor
case class User(id:Int,emailID:String,createdAt:Date =new Date())  extends Visitor


//visitor = Anonymous | User sum type pattern // Is
// Anonymous (id:Int,createdAt:Date =new Date()) //product type pattern //Has
//ADT
object TraitsExample extends App{

}