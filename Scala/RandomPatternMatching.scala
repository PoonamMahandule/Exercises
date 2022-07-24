
import scala.util.Random
object RandomPatternMatching extends App{
  val x: Int = Random.nextInt(10)
  val num = x match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _=> "Other"
  }
  println(RandomPatternMatching.num)

  val countingList = List(1,2,3,42)
  val mustHaveThree = countingList match {
    case List(_, _, 3, somethingElse) => s" I've got a list with 3 as third element, I found $somethingElse after"
  }

  println(RandomPatternMatching.mustHaveThree)

  val mustEndWithMeaningOfLife2 = countingList match {
    case List(1, _*) :+ 42 => "I really don't care what comes before the meaning of life"
  }
  println(RandomPatternMatching.mustEndWithMeaningOfLife2)
}

