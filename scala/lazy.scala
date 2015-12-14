def lazyInt: Int = {
  println("executed")
  1
}

// [v2.11.7]
// Yet!!
lazy val number = lazyInt

// [v2.11.7]
// executed
// 1
println(lazyVal)
