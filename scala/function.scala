// [v2.11.7]
// 123
def lazyVal = 123
lazyVal

// [v2.11.7]
// 9
def getSize(str: String) = str.size
getSize("something")

// [v2.11.7]
// 4
def sum(a: Int, b: Int): Int = {
  val a2 = a * 2
  val b2 = b * 2
  a2 + b2
}
sum(1, 1)

// [v2.11.7]
// SOMETHING
val f1: String => String = _.toUpperCase
f1("something")

// [v2.11.7]
// 3
val f2: (Int, Int) => String = (int1, int2) => {
  (int1 + int2).toString
}
f2(1,2)

// [v2.11.7]
// two
val pf: PartialFunction[Int, String] = {
  case 1 => "one"
  case 2 => "two"
}
pf(2)
