package meetup.scala

trait OperationsExamples {

	//	While loop

	var i = 0
	while (i<10){
		i = i+1
	}

	//	Classical (but not funcional) for-loop

  var n = 0
  for (i <- 0 to 10) {
    n = n + i
  }
  println(n) //55

  //	Folding...

  val folded =
    List(1, 2, 3).foldLeft(0)((n, i) => n + i)

  println(folded) //55

  //	Mapping...

  val list: List[Int] = List(1, 2, 3)
  val mapped: List[String] =
    list.map((number) => number.toString)

  //	FlatMapping...

  val anotherList: List[Int] = List(1, 2, 3)
  val flatMapped: List[Int] =
    anotherList.flatMap((number) => List(number * 3, number * 4))
  println(flatMapped) //List(3,4,6,8,9,12)

  val result: List[(Int, Boolean)] =
    for {
      number <- List(1, 2, 3)
      boolean <- List(true, false)
    } yield (number, boolean)

  val sameResult: List[(Int, Boolean)] =
    List(1, 2, 3)
      .flatMap((number) => List(true, false)
        .map((boolean) => (number, boolean)))

  println(result)
  //List((1,true),(1,false),(2,true),(2,false),(3,true),(3,false))

}

