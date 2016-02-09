![build status](https://travis-ci.org/test-objects/test-objects-for-scala.svg?branch=master)

# Usage
Test objects are exposed over via a fluent interface which makes usage fairly self explanatory from within any editor 
supporting auto-completion. 

## Basic
If the basic test object API supports all the test objects you need:

use directly
```SCALA
import org.testobjects.ATest

class SomeTest {

  ATest().string.nonNull
    
  ATest().seq.withElements(
    ATest().long.withValue(2),
    ATest().long.nonNull
  )

}
```

or via mixin
```SCALA
import org.testobjects.ATest

class SomeTest 
  extends ATest {

  string.nonNull
    
  seq.withElements(
    long.withValue(2),
    long.nonNull
  )

}
```

## Creating Your Own Test Object API
In general, your codebase will have custom types. A recommended approach to provide test objects for these types is
to extend the basic test object API to include your own types.

Lets say you have a custom type:

```SCALA
package co.onaboat

case class Boat(
  name:String,
  length:Int,
  topSpeed:Long
)
```

It is recommended you put your test infrastructure into a `tdk` package to separate it from your actual tests. 
Also, it's recommended to separate test objects from other test infrastructure in a testobjects package within your
tdk package so we don't blow up the root tdk package with an explosion of files:
```text
co
  |-- onaboat
     |-- tdk
        |-- testobjects        
```

It's recommended to name your custom test objects with following the convention `ATest{OBJECT_NAME}`. 
In our example this would give us ATestBoat. Lets implement ATestBoat:
     
```SCALA
package co.onaboat.tdk.testobjects

import org.testobjects.ATest

trait ATestBoat {

  def withValues(
    name : String = ATest().string.nonNull,
    length : Int = ATest().int.nonNull,
    topSpeed : Long = ATest().long.nonNull
  ): Boat =
    new Boat(
        name = name,
        length = length,
        topSpeed = topSpeed
     )  

  val notNull:Boat =
    withValues()

}

```

Although it's possible to use `ATestBoat` and any other test objects directly, it's recommended to make them all
available via a single API so they're easier to consume. 

It is recommended to implement your custom API via a trait named `ATest`, and provide a companion object exposing a
single lazy instance.

From your custom API you will generally still want access to the test objects exposed by the simple test objects API. 
We can achieve that by extending `org.testobjects.ATest` in our custom API:

```SCALA
package co.onaboat.tdk.testobjects

trait ATest
  extends org.testobjects.ATest {

  lazy val boat: ATestBoat =
    new ATestBoat {}

}

object ATest {

  private lazy val aTest = new ATest {}

  def apply(): ATest = aTest

}

```

And we're ready to go!
Now all you need to do is use it:

use directly:
```SCALA
package co.onaboat

import co.onaboat.tdk.testobjects.ATest

class SomeTest {

  // ooh.. custom test objects
  ATest().boat.nonNull
  
  // ahh..  basic test objects
  ATest().int.nonNull

}
```

or via mixin
```SCALA
package co.onaboat

import co.onaboat.tdk.testobjects.ATest

class SomeTest
  extends ATest {

  // if I care my boat's name is a nonNull string but don't care about it's length or topSpeed
  boat.withValues(
    name = string.nonNull
  )
  
  // ahh..  basic test objects
  int.nonNull

}
```


# Installation

## Available Versions
[see Bintray](https://bintray.com/test-objects/maven/test-objects-for-scala)

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
