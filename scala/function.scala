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
