class Animal(name: String) {
  def get() = name
}

// [v2.11.7]
// dog
val dog: Animal = new Animal("dog")
dog.get

case class People(name: String, age: Int)

// [v2.11.7]
// People(john, 23)
val people: People = People("john", 23)

// [v2.11.7]
// name: john, age: 23
people match {
  case People(name, age) => s"name: ${name}, age: ${age}"
  case _ => ""
}

// [v2.11.7]
// john
// 23
val People(name, age) = people
name
age
