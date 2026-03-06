ThisBuild / scalaVersion := "2.13.14"
ThisBuild / organization := "local"

lazy val root = (project in file("."))
  .settings(
    name := "scala-homework",
    libraryDependencies ++= Seq(
      "com.typesafe.play" %% "play-json" % "2.10.2",
      "org.scalatest" %% "scalatest" % "3.2.19" % Test
    ),
    scalacOptions ++= Seq("-encoding", "utf-8", "-deprecation", "-feature")
  )

