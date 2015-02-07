package meetup.scala

trait ValsVarsMethodsExamples {

  val iWontChange = "hello"
  //iWontChange = "bye" // Doesn't compile

  var iMayChange = 3
  iMayChange = 5
  println(iMayChange) //5

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

}