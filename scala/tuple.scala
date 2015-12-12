val t = (123, "something")

// [v2.11.7]
// 123
// something
t._1
t._2

// [v2.11.7]
// (something, 123)
t.swap

// [v2.11.7]
// i: Int = 123
// s: String = something
t.productIterator.foreach { value =>
  value match {
    case i: Int    => "i: Int = " + i
    case s: String => "s: String = " + s
    case _         => "nothing"
  }
}
