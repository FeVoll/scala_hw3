package homework

object Homework3 {

  trait Validator[T] {
    def validate(value: T): Boolean
  }

  implicit val stringValidator: Validator[String] = new Validator[String] {
    override def validate(value: String): Boolean =
      value.nonEmpty
  }

  implicit val intValidator: Validator[Int] = new Validator[Int] {
    override def validate(value: Int): Boolean =
      value > 0
  }

  def check[T](value: T)(implicit v: Validator[T]): Unit =
    if (v.validate(value)) println("OK") else println("Error")

  implicit class ValidOps[T](val value: T)(implicit v: Validator[T]) {
    def isValid: Boolean = v.validate(value)
  }
}

