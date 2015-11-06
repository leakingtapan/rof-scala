name := "ObjectFactory"

version := "1.0"

scalaVersion := "2.11.6"

organization := "com.amazon.datagen"

organizationName := "Amazon Technologies, Inc."

description := "A scala extension to Reflection Object Factory"

licenses += "Apache License Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt")

libraryDependencies ++= Seq(
  "com.amazon.datagen" % "objectfactory" % "1.0",
  "org.scala-lang" % "scala-reflect" % scalaVersion.value
)

// Sonatype Publish
publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

pomIncludeRepository := { _ => false }

pomExtra := (
    <url>"https://github.com/leakingtapan/rof-scala"</url>
    <scm>
      <url>https://github.com/leakingtapan/rof-scala</url>
      <connection>scm:git:https://github.com/leakingtapan/rof-scala.git</connection>
    </scm>
    <developers>
      <developer>
        <id>leakingtapan</id>
        <name>Cheng Pan</name>
        <url>http://leakingtapan.github.io</url>
      </developer>
    </developers>
)
