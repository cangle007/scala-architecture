scalaVersion := "3.5.2"
version := "1.0"
name := "scala-project"

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "fansi" % "0.4.0",
  "org.scalatest" %% "scalatest" % "3.2.17" % Test
)

lazy val eventStore = (project in file("src"))
  .settings(
    moduleName := "src"
  )
