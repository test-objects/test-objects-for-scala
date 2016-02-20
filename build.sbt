
name := "test-objects-for-scala"

organization := "org.testobjects"

version := "0.1.2"

pomExtra := <scm>
  <url>https://github.com/test-objects/test-objects-for-scala</url>
  <connection>scm:git:git@github.com:test-objects/test-objects-for-scala.git</connection>
</scm>

licenses +=("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

scalaVersion := "2.11.7"
crossScalaVersions := Seq("2.10.4","2.11.7")

libraryDependencies +=
  "org.scalatest" %% "scalatest" % "2.2.5" % "test"

publishTo := Some("Bintray API Realm" at "https://api.bintray.com/maven/test-objects/maven/test-objects-for-scala/;publish=1")

publishMavenStyle := false

credentials += Credentials(
  "Bintray API Realm",
  "api.bintray.com",
  sys.env.getOrElse(
    "BINTRAY_USERNAME",
    ""
  ),
  sys.env.getOrElse(
    "BINTRAY_API_KEY",
    ""
  )
)
