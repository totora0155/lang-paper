lazy val commonSettings = Seq(
  version := "0.1.0",
  scalaVersion := "2.11.7",
  sbtVersion := "0.13.9"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "example-scalatest",
    libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
  )
