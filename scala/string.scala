val something: String = "something"

// [v2.11.7]
// 9
// 9
something.length
something.size

// [v2.11.7]
// prefix-something
// something-suffix
"prefix-" + something
something.concat("-suffix")

// [v2.11.7]
// 4
// 4
something.indexOf("t")
something.lastIndexOf("t")

// [v2.11.7]
// true
something.matches("some.*")

// [v2.11.7]
// SOMEthing
// someTHINGsomeTHING
something.replaceFirst("some", "SOME")
(something * 2).replaceAll("thing", "THING")

// [v2.11.7]
// Array(some, hing)
something.split("t")

// [v2.11.7]
// thing
something.substring(4)

// [v2.11.7]
// SOMETHING
// something
something.toUpperCase
something.toUpperCase.toLowerCase

// [v2.11.7]
// something
"  something   ".trim

// [v2.11.7]
// s
// something
val sb: StringBuilder = new StringBuilder
sb += 's'
sb.toString
sb ++= "omething"
sb.toString

// [v2.11.7]
// some
// thing
val longLine = """
  | some
  | thing
""".stripMargin

println(longLine)
