name := "ConcurrentEffects"

version := "1.0"

scalaVersion := "2.13.3"

libraryDependencies += "org.typelevel" %% "cats-core" % "2.2.0"
libraryDependencies += "org.typelevel" %% "cats-effect" % "2.2.0"

// CI build
addCommandAlias("buildceBasics", ";clean;+test;")

scalacOptions ++= Seq(
  "-encoding",
  "UTF-8", // source files are in UTF-8
  "-deprecation", // warn about use of deprecated APIs
  "-unchecked", // warn about unchecked type parameters
  "-feature", // warn about misused language features
  "-language:higherKinds", // allow higher kinded types without `import scala.language.higherKinds`
  "-language:postfixOps",
  "-Xlint", // enable handy linter warnings
  "-Xfatal-warnings", // turn compiler warnings into errors
  "-Ywarn-unused"
)
