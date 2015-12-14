implicit val num: Int = 3

// [v2.11.7]
// 6
def fnum(implicit num: Int) = num * 2
fnum

// [v2.11.7]
// 5
def f2num(num1: Int)(implicit num2: Int) = num1 + num2
f2num(2)

// [v2.11.7]
// 3
// ab
abstract class Calc[A] {
  def add(x: A, y: A): A
}
implicit object StringCalc extends Calc[String] {
  def add(a: String, b: String): String = a + b
}
implicit object IntCalc extends Calc[Int] {
  def add(a: Int, b: Int): Int = a + b
}
def sum[A](val1: A, val2: A)(implicit c: Calc[A]): A = c.add(val1, val2)
sum(1, 2)
sum("a", "b")
