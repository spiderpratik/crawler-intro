package com.indix.bootcamp.utils

import org.jsoup.Jsoup

trait TestUtils { me =>
  def readFile(filename: String) = {
    io.Source
      .fromInputStream(me.getClass.getResourceAsStream(filename))
      .getLines()
      .mkString("\n")
  }

  def readDocument(filename: String) = {
    Jsoup.parse(readFile(filename))
  }
}
