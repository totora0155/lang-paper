import scala.collection.immutable.Map
val date: Map[String, Int] = Map("year" -> 2099, "month" -> 1, "date" -> 1)

// [v2.11.7]
// 2099
// Some(2099)
// None
date("year")
date.get("year")
date.get("???")

// [v2.11.7]
// Map(month -> 1, date -> 1, hour -> 1)
var tmp: Map[String, Int] = date
tmp += ("hour" -> 1)
tmp -= ("year")
