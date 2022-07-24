/*A calcula􏰀on may succeed (with an Int result) or fail (with a String message). Implement this.
* */

sealed trait Calculator
case class Success(result:Int) extends Calculator
case class Failure(message:String) extends Calculator

