package homework

object Homework1 {

  // Бесконечный лист чисел Фибоначчи
  lazy val fibonacci: LazyList[BigInt] = {
    def loop(a: BigInt, b: BigInt): LazyList[BigInt] =
      a #:: loop(b, a + b)

    loop(0, 1)
  }
  lazy val first10FibDivBy3: Vector[BigInt] =
    fibonacci.filter(_ % 3 == 0).take(10).toVector
}

