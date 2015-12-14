val something: Int = 13

// [v2.11.7]
// d
something.toHexString

// [v2.11.7]
// 20
// 10
// 130
// 1
// 3
something + 7
something - 3
something * 10
something / 10
something % 10

// [v2.11.7]
// 13
-something.abs

// [v2.11.7]
// Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
// Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
1 to something
1 until something

// [v2.11.7]
// bigSomething: BigInt = 131 ->
//   bigSomething: Int = 131
val bigSomething: BigInt = 131
bigSomething.intValue
