package meetup.scala

trait ClassExamples {

  //  Classic Foo class

  class Foo {

    val number: Int = 2

    var state: String = "initialized"

    {
      //This is a expression block evaluated at instantiation
      number.toString // "2"
      number + 2 // 4
      println(number) // 2
    }

    // Some expressions evaluated when Foo is instantiated
    println(state) // "initialized"

  }

  //	A simple class without parameters

  class A {
    val multiplier = 2
    def getTwiceOf(number: Int): Int =
      multiplier * number
  }

  //	Let's try it

  val anAInstance = new A()

  println(anAInstance.getTwiceOf(5)) //10

  //	A class with parameters

  class B(attribute: String) {
    val computedAttribute = "A new " + attribute
  }

  val aBInstance = new B("potatoe")

  println(aBInstance.computedAttribute) //"A new potatoe"
  //aBInstance.attribute //Does not compile!

  //	A class with attribute accessor

  class C(
    val number: Int,
    val someString: String)

  val aCInstance = new C(4, "hello")

  println(aCInstance.number + " " + aCInstance.someString) //"4 hello"

  //	An abstract class

  abstract class D(number: Int) {
    def printNumber(): Unit = {
      println(number)
    }
  }

  //val aDInstance = new D("potatoe") // nope! but...
  val aDInstance = new D(5) {
    /* this is anonymous class that extends D*/
  }

  aDInstance.printNumber //5

  //	Ugly option...
  class JavaLikeClass {
    var attribute: Any = null
    def setAttribute(attr: Any): Unit = {
      attribute = attr
    }
  }

  val uglyInstance =
    new JavaLikeClass()
  println(uglyInstance.attribute) //What did you expect... ¬¬
  uglyInstance.setAttribute(2)
  println(uglyInstance.attribute)

}