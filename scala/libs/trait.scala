trait People {
  val name: String
  val age: Int
  val sex: String
}

case class Man(name: String, age: Int) extends People {
  val sex = "man"
}

// [v2.11.7]
// (John,20,man)
object TraitPaper {
  def main(args: Array[String]) {
    val man = Man("John", 20)
    println(man.name, man.age, man.sex)
  }
}
