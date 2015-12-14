val logging = "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0"

lazy val commonSettings = Seq(
  version := "0.1.0",
  scalaVersion := "2.11.7",
  sbtVersion := "0.13.9"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "example-scala-logging",
    libraryDependencies += logging
  )
