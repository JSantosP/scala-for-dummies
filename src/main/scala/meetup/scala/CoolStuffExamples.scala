package meetup.scala

trait CoolStuffExamples {

  //	Higher order funcions

  object Calculator {

    type Term = Int

    type Result = Int

    type Operation = (Term, Term) => Result

    val add: Operation = (n1, n2) => n1 + n2

    val sub: Operation = (n1, n2) => n1 - n2

    val mul: Operation = (n1, n2) => n1 * n2

    def calculate(n1: Term, n2: Term)(f: Operation): Result =
      f(n1, n2)
  }

  object MyCalculus {

    import Calculator._

    val simpleAdd = calculate(2, 5)(add)

    val customCalculus = calculate(1, 6)((n1, n2) => n1 * n2 + 10)

  }

  //	Imlicits

  import scala.language.implicitConversions

  case class Point(x: Int, y: Int)

  implicit def tupleToPoint(tuple: (Int, Int)) =
    Point(tuple._1, tuple._2)

  def sumPoints(p1: Point, p2: Point) =
    Point(p1.x + p2.x, p1.y + p2.y)

  val p1: Point = Point(1, 2)
  val p2: (Int, Int) = (3, 4)

  sumPoints(p1, p2)

  class SelfTypedClass{ self =>
  	val x: Int = 1
  	def method(x: Int): Unit = {
  		println(self.x)
  		println(x)
  	}

  }

}