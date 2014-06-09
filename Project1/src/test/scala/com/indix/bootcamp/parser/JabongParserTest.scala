package com.indix.bootcamp.parser

import org.scalatest.{Matchers, FunSuite}
import com.indix.bootcamp.utils.TestUtils

class JabongParserTest extends FunSuite with Matchers with TestUtils {

  test("should parse product page") {
    val document = readDocument("/jabong/jabong_1.html")
    val parser = new JabongParser
    val parsedProduct = parser.parseProduct(document, "http://www.jabong.com/killer-Blue-Slim-Fit-Jeans-599628.html")
    parsedProduct.name should be("KILLER Blue Slim Fit Jeans")
    parsedProduct.description should include("Blue Slim Fit Jeans")
  }

  test("should parse prices from product page") {
    val document = readDocument("/jabong/jabong_1.html")
    val parser = new JabongParser
    val parsedPrice = parser.parsePrice(document)
    parsedPrice.listPrice should be(1999.0)
    parsedPrice.salePrice should be(1999.0)
  }
}
