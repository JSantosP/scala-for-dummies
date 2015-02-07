package meetup.scala

trait MixinExamples {

  abstract class Animal(isUrban: Boolean)

  trait CanFly {
    val altitude: Float
  }

  trait CanJump {
    def jump() {
      println("boing")
    }
  }

  class Pigeon extends Animal(isUrban = true)
    with CanFly
    with CanJump {

    val altitude = 0.5f

    def eatRock() {
      println("NOM NOM!")
    }

  }

  val pigeon = new Pigeon
  pigeon.jump()
  pigeon.eatRock()

  trait A {
  	println("A")
  }

  trait B {
  	println("B")
  }

  class C extends A with B {
  	println("C")
  }

  new C // Will print: "A" "B" "C"

}