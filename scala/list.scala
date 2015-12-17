val days: List[String] = List("mon", "tue", "wed", "thu", "fri")

// [v2.11.7]
// List(sun, mon, tue, wed, thu, fri)
// List(mon, tue, wed, thu, fri, sat)
// List(sun, mon, tue, wed, thu, fri, sat)
"sun" :: days
days ::: ("sat" :: Nil)
List.concat(("sun" :: Nil), days, ("sat" :: Nil))

// [v2.11.7]
// List(1, 2, 3, 4)
List(List(1, 2), List(3, 4)).flatten

// [v2.11.7]
// 5
// 5
days.length
days.size

// [v2.11.7]
// mon
// fri
// List(mon, the, wed, thu)
// List(tue, wed, thu, fri)
days.head
days.last
days.init
days.tail

// [v2.11.7]
// List(fri, mon, thu, the, wed)
// List(fri, thu, wed, tue, mon)
days.sorted
days.reverse

// [v2.11.7]
// 1
// 3
days.indexOf("tue")
List(1, 2, 3, 2, 1).lastIndexOf(2)

// [v2.11.7]
// 789
// 123
// 1368
List(123, 456, 789).max
List(123, 456, 789).min
List(123, 456, 789).sum

// [v2.11.7]
// List(1, 1, 1, 1, 1)
List.fill(5)(1)

// [v2.11.7]
// List(0, 1, 4, 9, 16)
// List(List(0, 1, 2), List(1, 2, 3), List(2, 3, 4))
List.tabulate(5)(n => n * n)
List.tabulate(3,3)(_ + _)

// [v2.11.7]
// List(1, 2, 3)
List(1, 2, 3, 2, 1).distinct

// [v2.11.7]
// List(mon, the)
// List(thu, fri)
days.take(2)
days.takeRight(2)

// [v2.11.7]
// List(web, tru, fri)
// List(mon, tue, wed)
// List()
days.drop(2)
days.dropRight(2)
days.dropWhile(_.size == 3)

// [v2.11.7]
// List(mon, thu)
// List(the, wed, fri)
days.filter(_.matches("mon|thu"))
days.filterNot(_.matches("mon|thu"))

// [v2.11.7]
// mon tue wed thu fri
days.foreach { d => d + " " }

// [v2.11.7]
// List(MON, THE, WED, THU, FRI)
days.map(_.toUpperCase)

// [v2.11.7]
// "one"
// "two"
List(1, 2) map {
  case 1 => "one"
  case 2 => "two"
}

// [v2.11.7]
// 16
// 26
List(1, 3, 5, 7).reduceLeft(_ + _)
List(1, 3, 5, 7).foldLeft(10)(_ + _)

// [v2.11.7]
// mon_tue_wed_thu_fri
days.mkString("_")

// [v2.11.7]
// true
// false
days.contains("mon")
days.contains("???")

// [v2.11.7]
// true
days.exists(_.matches("mon"))

// [v2.11.7]
// true
days.forall(_.size == 3)

// [v2.11.7]
// true
List().isEmpty
