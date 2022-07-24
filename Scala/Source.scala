/*Bo􏰁led water has a size (an Int), a source (which is a well, spring, or tap), and a Boolean carbonated. Implement this in Scala.
* */

sealed trait Source
 class Well extends Source
 class Spring extends Source
 class tap extends Source
 case class BottledWater (size:Int,source: Source,carbonated:Boolean)



