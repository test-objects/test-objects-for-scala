package io.github.chrisdostert.testobjects.testobjects

trait ATestLong {

  def withValue(long: Long): Long = long

  val nonNull: Long = 0L

}
