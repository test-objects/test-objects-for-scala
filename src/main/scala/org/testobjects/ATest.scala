package org.testobjects

/**
  * A fluent test objects API
  */
trait ATest {

  lazy val boolean: ATestBoolean = new ATestBoolean {}

  lazy val instant: ATestInstant = new ATestInstant {}

  lazy val int: ATestInt = new ATestInt {}

  lazy val long: ATestLong = new ATestLong {}

  lazy val option: ATestOption = new ATestOption {}

  lazy val seq: ATestSeq = new ATestSeq {}

  lazy val string: ATestString = new ATestString {}

}

object ATest {

  private lazy val aTest = new ATest {}

  def apply(): ATest = aTest

}
