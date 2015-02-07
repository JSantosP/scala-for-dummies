package meetup.scala

trait OperationsExamples {

  val list = List(1, 2, 3)
  val initialValue = "this list contains :"

  val folded = list.foldLeft(initialValue)(
    (accumulator, number) => accumulator + " " + number)

  println(folded)

}

