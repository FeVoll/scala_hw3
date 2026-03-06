package homework

import Homework3._

object Main extends App {
  println("Задание 1:")
  println(Homework1.first10FibDivBy3.mkString(", "))

  println("\nЗадание 2:")
  println(Homework2.getUserDiscount(1))
  println(Homework2.getUserDiscount(2))

  println("\nЗадание 3:")
  Homework3.check("hello")
  Homework3.check("")
  Homework3.check(10)
  Homework3.check(-5)
  println("scala".isValid)
  println(0.isValid)

  println("\nЗадание 4:")
  val jsonStr = """{"id": 1, "name": "Laptop", "price": 999.99, "tags": ["tech", "work"]}"""
  println(ProductJson.increasePriceBy10Percent(jsonStr))
}

