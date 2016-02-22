![build status](https://travis-ci.org/test-objects/test-objects-for-scala.svg?branch=master)

# Usage
see [Getting Started](docs/GettingStarted.md)

# Installation

prerequisites:

- scala >= 2.10 
- JVM >= 1.8 (see [test-objects-for-scala-jvm1.7](https://github.com/test-objects/test-objects-for-scala-jvm1.7) if you need JVM 1.7 support)

see [Bintray](https://bintray.com/test-objects/maven/test-objects-for-scala) for latest version

all versions are distributed to [jcenter](https://bintray.com/bintray/jcenter)

## SBT

```SCALA
// build.sbt
// by default sbt resolves artifacts from jcenter so this one liner is all that's needed : ) 
libraryDependencies += "org.testobjects" %% "test-objects-for-scala" % testObjectsForScalaVersion

```

# Versioning

The versioning of this project adheres to the [Semantic Versioning 2.0.0](http://semver.org/spec/v2.0.0.html) spec

# License

This code is open source software licensed under the [Apache 2.0 License](http://www.apache.org/licenses/LICENSE-2.0).

# Contributing

refer to [CONTRIBUTING.md](CONTRIBUTING.md)
