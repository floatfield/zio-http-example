

ThisBuild / scalaVersion := "2.13.6"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "zio-http",
    libraryDependencies ++= Seq(
      "io.d11" %% "zhttp" % "1.0.0.0-RC17",
      "dev.zio" %% "zio" % "1.0.11"
    ),
    assembly / assemblyJarName := "server.jar"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
