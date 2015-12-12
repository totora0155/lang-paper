import scala.collection.immutable.Set
val days: Set[String] = Set("mon", "tue", "wed", "thu", "fri")

// [v2.11.7]
// true
// true
// false
days("mon")
days.contains("mon")
days("???")

// [v2.11.7]
// Set(thu, tue, fri, sat, wed)
var tmp: Set[String] = days
tmp += "sat"
tmp -= "mon"
