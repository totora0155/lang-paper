// [v2.11.7]
// Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val nums1: IndexedSeq[Int]  = for (
  i <- 1 to 10
) yield i

// [v2.11.7]
// Vector(2, 4, 6, 8, 10)
val nums2: IndexedSeq[Int] = for (
  i <- 1 to 10
  if (i % 2 == 0)
) yield i

// [v2.11.7]
// Vector((2,1), (2,2), (2,3), (2,4), (2,5), (4,1), (4,2), (4,3), (4,4), (4,5),
// (6,1), (6,2), (6,3), (6,4), (6,5), (8,1), (8,2), (8,3), (8,4), (8,5), (10,1),
// (10,2), (10,3), (10,4), (10,5))
val nums3: IndexedSeq[(Int, Int)] = for {
  i <- 1 to 10
  if (i % 2 == 0)
  j <- 1 to 5
} yield (i, j)
// instead of ↓
// val nums4: IndexedSeq[(Int, Int)] = for (
//   i <- 1 to 10
//   if (i % 2 == 0);
//   j <- 1 to 5
// ) yield (i, j)
