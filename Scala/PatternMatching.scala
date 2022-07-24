object PatternMatching extends App{
  val aNumber = 44
  val ordinal = aNumber match {
    case 1 => "first"
    case 2 => "second"
    case 3 => "third"
    case _ => aNumber + "th" // ignore the English grammar will you please
  }
  println(PatternMatching.ordinal)

  // condition gaurds
  val conditiongaurds = 34 match {
    case 1 => "first"
    case 2 => "second"
    case 3 => "third"
    case n if n % 10 == 1 => n + "st"
    case n if n % 10 == 2 => n + "nd"
    case n if n % 10 == 3 => n + "rd"
    case n => n + "th"
  }
  println(PatternMatching.conditiongaurds)

  def gimmeAValue:Any = ()
  val gimmeTheType = gimmeAValue match {
    case _: String => "I have a string"
    case _: Int => "I have a number"
    case _:Float => "I have Float"
    case _=> "I have something else"
  }
  println(PatternMatching.gimmeTheType)

  def evenOdd(a:Int) = a match {
    case _ if a % 2 == 0 => print("even")
    case _ => print("odd")
  }

  println(PatternMatching.evenOdd(19))



}
