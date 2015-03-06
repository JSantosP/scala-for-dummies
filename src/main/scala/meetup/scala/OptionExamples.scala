package meetup.scala

trait OptionExamples {

  case class User(
    name: Option[String],
    age: Int)

  val anonymous = User(None,18)

  val known = User(Some("Philip"),20)

  known.name.get // Accessing to optional value

  known.name.getOrElse("Unknown") // Accessing with default value

  if (anonymous.name.isDefined) println("Recognised!") // Is defined?

  known.name.map(userName => userName.toUpperCase) // Changing contained value

  anonymous.name.foreach(userName => println(userName)) // Iterable too!

  // Extra cool Option-stuff

  anonymous.name.fold(ifEmpty = println("Unknown"))(userName => println("Defined! :",userName))

  known.name match {
    case Some(userName) => println("Defined! :",userName)
    case None => println("Unknown")
  }

}
