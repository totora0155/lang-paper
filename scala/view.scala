// [v2.11.7]
// Vector(22, 20, 18, 16, 14, 12, 10, 8, 6, 4)
val v: scala.collection.immutable.Vector[Int] = Vector(1 to 10: _*)
val vv: scala.collection.SeqView[Int,scala.collection.immutable.Vector[Int]] = v.view
// scala.collection.SeqView[Int,Seq[_]] = SeqViewM(...)
val vvm: scala.collection.SeqView[Int,Seq[_]] = vv map (_ + 1)
// scala.collection.SeqView[Int,Seq[_]] = SeqViewMM(...)
val vvmm: scala.collection.SeqView[Int,Seq[_]] = vvm map (_ * 2)
// scala.collection.SeqView[Int,Seq[_]] = SeqViewMMR(...)
val vvmmr: scala.collection.SeqView[Int,Seq[_]] = vvmm.reverse
vvmmr.force

// [v2.11.7]
// Array(0, 1, -2, -3, -4, -5, 6, 7, 8, 9)
val arr: Array[Int] = (0 to 9).toArray
val vs: scala.collection.mutable.IndexedSeqView[
Int,Array[Int]] = arr.view.slice(2, 6)
def negate(xs: collection.mutable.Seq[Int]) =
  for (i <- 0 until xs.length) xs(i) = -xs(i)
negate(vs)
arr
