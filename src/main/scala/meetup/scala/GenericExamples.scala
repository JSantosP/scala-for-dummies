package meetup.scala

trait GenericExamples {

  // Generic class

  class MyAwesomeCollection[T](initCollection: Seq[T]) {

    val awesomeList: Seq[T] = initCollection

    def contains(element: T): Boolean =
      awesomeList.contains(element)

    def addNewElement(element: T): Seq[T] =
      awesomeList :+ element

    // Generic Method

    def hasMoreElementsThan[S](otherCollection: Seq[S]): Boolean =
      awesomeList.size > otherCollection.size

    //We don't like nulls. Option is cool :)

    def getFirst: Option[T] =
      if(awesomeList.isEmpty)
        None
      else
        Some(awesomeList.head)

  }

  val myCollection = new MyAwesomeCollection(Seq(1, 2, 3))
  myCollection.contains(3) //true

  val otherCollection = new MyAwesomeCollection(Seq("hello", "world"))
  otherCollection.getFirst //Some("hello")

  myCollection.hasMoreElementsThan(otherCollection.awesomeList) //true

}