package org.testobjects

trait ATestSeq {

  def nonNull[T]: Seq[T] = Seq.empty

  def empty[T]: Seq[T] = Seq.empty

  def withElements[T](elements: T*): Seq[T] = Seq(elements: _*)

}
