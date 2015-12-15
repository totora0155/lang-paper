// [v2.11.7]
// 1
// Stack()
val ms = scala.collection.immutable.Stack.empty
val hasOne = ms.push(1)
hasOne.top
hasOne.pop

// [v2.11.7]
// Stack(1)
// Stack(2, 1)
// 2
// 2
// 1
val ims = new scala.collection.mutable.Stack[Int]
ims.push(1)
ims.push(2)
ims.top
ims.pop
ims.top
