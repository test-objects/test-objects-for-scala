import java.time.Instant

name := "test-objects-for-scala"

organization := "io.github.chrisdostert"

version := s"0.0.${Instant.now().toEpochMilli}"

licenses +=("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.5" % "test"
)

bintrayVcsUrl := Some("git@github.com:chrisdostert/test-objects-for-scala.git")
