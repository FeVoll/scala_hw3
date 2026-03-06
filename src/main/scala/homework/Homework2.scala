package homework

object Homework2 {

  case class User(id: Int, name: String)
  case class Order(id: Int, userId: Int, amount: Double)

  // Заглушки
  def findUser(id: Int): Option[User] =
    if (id == 1) Some(User(1, "Alice")) else None

  def getActiveOrder(user: User): Option[Order] =
    if (user.id == 1) Some(Order(42, user.id, 600.0)) else None

  def calculateDiscount(order: Order): Either[String, Double] =
    if (order.amount < 500) Left("Слишком маленькая сумма для скидки")
    else Right(order.amount * 0.10)

  def getUserDiscount(userId: Int): Either[String, Double] =
    for {
      user  <- findUser(userId).toRight("Пользователь не найден")
      order <- getActiveOrder(user).toRight("Активный заказ не найден")
      disc  <- calculateDiscount(order)
    } yield disc
}

