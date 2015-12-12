val ls: List[Int] = List(1, 2, 3, 4, 5)

// [v2.11.7]
// 1
// 2
val iterator: Iterator[Int] = ls.iterator
iterator.next
iterator.next

// [v2.11.7]
// List(1, 2)
// List(3, 4)
val grouped: Iterator[List[Int]] = ls.grouped(2)
grouped.next
grouped.next

// [v2.11.7]
// List(1, 2)
// List(2, 3)
val sliding: Iterator[List[Int]] = ls.sliding(2)
sliding.next
sliding.next
