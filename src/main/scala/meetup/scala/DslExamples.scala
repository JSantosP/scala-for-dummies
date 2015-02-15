package meetup.scala

trait DslExamples {

  import LolCode._

  {

    implicit val _ = new Program

    HAI;

    CAN.HAS("STDIO").?;

    AWSUM.THX {

      VISIBLE.FILE;

    }

    O.NOES {

      INVISIBLE.ERROR;

    }

    KTHXBYE;

  }

  {

    implicit val _ = new Program

    HAI

    CAN HAS ("STDIO") ?

    AWSUM THX {

      VISIBLE FILE

    }

    O NOES {

      INVISIBLE ERROR

    }

    KTHXBYE

  }

}

case class Statement(explanation: String)

class Program {
  var statements: List[Statement] = List()
  def +=(statement: Statement) {
    statements = statements :+ statement
  }
}
object LolCode {

  def HAI(implicit program: Program) =
    program += Statement("Just init the program")

  def CAN(implicit program: Program) = new {
    def HAS(lib: String) = new {
      def ? {
        program += Statement(s"Import $lib module")
      }
    }
  }

  def AWSUM(implicit program: Program) = new {
    def THX(statement: Statement) =
      program += statement
  }

  def VISIBLE = new {
    def FILE = Statement("Open file and show its content")
  }

  def O(implicit program: Program) = new {
    def NOES(statement: Statement) =
      program += statement
  }

  def INVISIBLE = new {
    def ERROR =
      Statement(s"Shows associated stack in error output")
  }

  def KTHXBYE(implicit program: Program) {
    program.statements.foreach(println)
  }

}