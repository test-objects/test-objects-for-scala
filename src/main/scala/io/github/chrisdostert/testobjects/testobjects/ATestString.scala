package io.github.chrisdostert.testobjects.testobjects

import java.util.UUID

trait ATestString {

  val emailAddress: String = "mailbox@domain.com"

  def nonEmpty: String = "nonEmpty"

  val nonNull: String = ""

  def ofLength(length: Int): String = Array.fill(length)("a").mkString

  def unique: String = UUID.randomUUID().toString

  def uniqueEmailAddress: String = s"$unique@m.o"

  def withValue(string: String): String = string

}

