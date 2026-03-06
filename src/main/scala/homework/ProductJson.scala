package homework

import play.api.libs.functional.syntax._
import play.api.libs.json._

case class Product(id: Long, name: String, price: Double, tags: List[String])

object ProductJson {

  implicit val productFormat: Format[Product] = (
    (__ \ "id").format[Long] and
      (__ \ "name").format[String] and
      (__ \ "price").format[Double] and
      (__ \ "tags").format[List[String]]
  )(Product.apply, unlift(Product.unapply))

  def increasePriceBy10Percent(jsonStr: String): String = {
    val json = Json.parse(jsonStr)
    val product = json.as[Product]
    val updated = product.copy(price = product.price * 1.10)
    Json.stringify(Json.toJson(updated))
  }
}

