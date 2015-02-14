package meetup.scala

trait MatchExamples {

  val condition = (15 % 5 == 0)
  if (condition)
    println("this line doesn't need braces")
  else if (true) {
    val auxValue = 2
    println("...but this line does need them")
  } else ()

  //	Match acts like a Java switch...

  val someValue: Int = 1

  someValue match {
    case 0 => println("It's not zero,man...")
    case 1 => println("yeah!")
    case _ => println("If other cases didn't match...")
  }

  //	...except it's not only a switch...

  case class Wheel(inch: Float)

  case class Car(brand: String, wheelType: Wheel)

  val mySundaysCar: Car = Car("Tiaf Fanda", Wheel(28))

  mySundaysCar match {
    case Car("Ferrari", _) => println("You wish it was a Ferrari")
    case Car(_, Wheel(35)) => println("Of course it's not a tractor...")
    case Car(_, Wheel(size)) => println("Actual wheel size is " + size)
    case Car(_, Wheel(size)) if size > 10 => println("Maybe a tank?")
    case car: Car => println("Ok, we were assuming this was a car...")
    case `mySundaysCar` => println("... oh, wait! We were assuming this was my sunday's car!")
    case _ => println("Don't know what to do with this car")
  }

  //	Pattern matching, yeah!

}
