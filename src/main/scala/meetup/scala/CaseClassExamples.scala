package meetup.scala

trait CaseClassExamples {

	case class Student(
		age: Int,
		name: String)

	//	...equals...

	class Pupil(
		val age: Int,
		val name: String) extends Serializable {

		def copy(
			age: Int = this.age, 
			name: String = this.name): Pupil = new Pupil(age,name)
	}

	object Pupil {

		def apply(age: Int,name: String): Pupil =
			new Pupil(age,name)

		def unapply(pupil: Pupil): Option[(Int,String)] =
			Some((pupil.age,pupil.name))

	}

}