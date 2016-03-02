
name := "test-objects-for-scala"

organization := "org.testobjects"

homepage := Some(new URL("https://github.com/test-objects/test-objects-for-scala"))

pomExtra :=
  <scm>
    <url>https://github.com/test-objects/test-objects-for-scala</url>
    <connection>scm:git:git@github.com:test-objects/test-objects-for-scala.git</connection>
  </scm>
    <developers>
      <developer>
        <id>chrisdostert</id>
        <name>Chris Dostert</name>
        <url>https://github.com/chrisdostert</url>
      </developer>
    </developers>

version := "0.1.4"

licenses +=("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

scalaVersion := "2.11.7"
crossScalaVersions := Seq(
  "2.10.4",
  "2.11.7"
)

pomIncludeRepository := { _ => false }

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.5" % "test"

publishTo := Some("Bintray API Realm" at "https://api.bintray.com/maven/test-objects/maven/test-objects-for-scala/;publish=1")

publishMavenStyle := true

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
