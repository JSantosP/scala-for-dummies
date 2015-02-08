package meetup.scala

trait ValsVarsMethodsExamples {

  val iWontChange = "hello"
  //iWontChange = "bye" // Doesn't compile

  var iMayChange: Int = 3
  iMayChange = 5
  println(iMayChange) //5

  lazy val lazyValue: Int = 2//Not evaluated yet
  println(lazyValue)//Now, it's evaluated

  class Foo {
    var state: String = "idle"
    def initate {
      state = "initiated"
    }
  }
  val foo = new Foo
  println(foo.state) //"idle"
  foo.initate
  println(foo.state) //"initiated"

  def someMethod(): Unit = {
    println("hi!")
  }

  def anotherValidMethod(): Unit =
    println("hey!")

  def power(n: Int): Int =
    n * n

  def factorial(n: Int): Int =
    if (n == 1) 1
    else n * factorial(n - 1)

  def method(n: Int*): Unit =
    n.foreach(println)

  method(1,2,3) //"1" "2" "3"

}