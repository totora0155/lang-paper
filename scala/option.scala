val something: Option[String] = Some("something")
val nothing: Option[String] = None

// [v2.11.7]
// something
something.get

// [v2.11.7]
// null
nothing.orNull

// [v.2.11.7]
// Some(something)
nothing.orElse(something)

// [v2.11.7]
// something
// nothing
something.getOrElse("nothing")
nothing.getOrElse("nothing")

// [v2.11.7]
// something
something match {
  case Some(s) => s
  case None    => "nothing"
}

// [v2.11.7]
something.foreach { s => /* come */ }
nothing.foreach { s => /* not come */ }

// [v2.11.7]
// Some(SOMETHING)
something.map { s => s.toUpperCase }

// [v2.11.7]
// Some(something)
something.filter { s => s.size < 10 }

// [v2.11.7]
// SOMETHING
something.fold("")(_.toUpperCase)

// [v2.11.7]
// prefix-something
something.foldLeft("prefix-") { (a, b) => a + b }

// [v2.11.7]
// Some(something)
Some(something).flatten

// [v2.11.7]
// false
// true
// true
// false
something.isEmpty
something.nonEmpty
nothing.isEmpty
nothing.nonEmpty

// [v2.11.7]
// true
something.contains("something")

// [v2.11.7]
// true
something.forall(_.size == 9)
