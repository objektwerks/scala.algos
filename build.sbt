name := "scala.algos"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.6.3"
libraryDependencies ++= {
  Seq(
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wall"
)
