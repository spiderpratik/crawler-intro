package com.indix.bootcamp.utils

object Utils {

  def Managed[R](block: => R): Option[R] = {
    try {
      Option(block)
    } catch {
      case e: Exception => None
    }
  }

}
