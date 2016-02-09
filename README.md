![build status](https://travis-ci.org/test-objects/test-objects-for-scala.svg?branch=master)

# Usage
Test objects are exposed over via a fluent interface which makes usage fairly self explanatory from within any editor 
supporting auto-completion. 

## Basic
If the basic test object API supports all the test objects you need, all you need to do is directly reference `ATest()`. 
As follows:

```SCALA
import org.testobjects.ATest

ATest().string.nonNull

ATest().seq.withElements(
  ATest().long.withValue(2),
  ATest().long.nonNull
)

```

## Extending The Basic Test Object API
In general, your codebase will have custom types. A recommended approach to provide test objects for these types is
to extend the basic test object API. 

The recommended approach for doing this is as follows:

```SCALA
import org.testobjects.ATest
```

# Available Versions
[see Bintray](https://bintray.com/test-objects/maven/test-objects-for-scala)

# Installation

## SBT

```SCALA
// build.sbt

libraryDependencies += "org.testobjects" %% "test-objects-for-scala" % testObjectsForScalaVersion

```

# Versioning

The versioning of this project adheres to the [Semantic Versioning 2.0.0](http://semver.org/spec/v2.0.0.html) spec

# License

This code is open source software licensed under the [Apache 2.0 License](http://www.apache.org/licenses/LICENSE-2.0).

# Contributing

refer to [CONTRIBUTING.md](CONTRIBUTING.md)
