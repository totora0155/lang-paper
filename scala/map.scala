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
// Map(year -> 2099, month -> 1, date -> 1, hour -> 0)
// Map(min -> 0, year -> 2099, hour -> 1, sec -> 0, date -> 1, month -> 1)
date + ("hour" -> 0)
date ++ Map("hour" -> 1, "min" -> 0, "sec" -> 0)

// [v2.11.7]
// 3
date.size

// [v2.11.7]
// (year, 2099)
// (date, 1)
// Map(year -> 2099, month -> 1)
// Map(month -> 1, date -> 1)
date.head
date.last
date.init
date.tail

// [v2.11.7]
// (year, 2099)
// (date, 1)
date.max
date.min

// [v2.11.7]
// Set(year, month, date)
// MapLike(2099, 1, 1)
date.keys
date.values

// [v2.11.7]
// Map(year -> 2099)
// Map(date -> 1)
// Map(year -> 2099)
date.take(1)
date.takeRight(1)
date.takeWhile(_._1 == "year")

// [v2.11.7]
// Map(month -> 1, date -> 1)
// Map(year -> 2099, month -> 1)
// Map(month -> 1, date -> 1)
date.drop(1)
date.dropRight(1)
date.dropWhile(_._2 != 1)

// [v2.11.7]
// Some((year, 2099))
// None
date.find(_._1 == "year")
date.find(_._1 == "???")

// [v2.11.7]
// Map(month -> 1, date -> 1, hour -> 1)
var tmp: Map[String, Int] = date
tmp += ("hour" -> 1)
tmp -= ("year")

// [v2.11.7]
// false
date.isEmpty

// [v2.11.7]
// true
date.contains("year")

// [v2.11.7]
// Map()
val emptyMap = scala.collection.mutable.Map.empty[String, Any]
emptyMap
