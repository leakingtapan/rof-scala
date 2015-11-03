name := "rof-scala"

version := "1.0"

scalaVersion := "2.11.6"

organization := "com.amazon.datagen"

organizationName := "Amazon Technologies, Inc."

description := "A scala extension to Reflection Object Factory"

licenses += "Apache License Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt")

libraryDependencies ++= Seq(
  "com.amazon.datagen" % "objectfactory_2.11" % "1.0"
)