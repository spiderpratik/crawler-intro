package com.indix.bootcamp.crawler

import edu.uci.ics.crawler4j.crawler.{Page, WebCrawler}
import edu.uci.ics.crawler4j.parser.HtmlParseData
import com.indix.bootcamp.parser.{Parser, FlipkartParser, JabongParser}
import java.io.{PrintWriter, File}
import scala.util.Random
import edu.uci.ics.crawler4j.url.WebURL
import com.indix.bootcamp.models.Price

abstract class BaseCrawler extends WebCrawler {
  val parser: Parser
  val filename = "results-" + Random.nextInt(Int.MaxValue) + ".csv"
  println("File Name : " +  filename)
  val writer = new PrintWriter(new File("/tmp/crawler4j-scala/" + filename))

  /*
    TODO: By default the crawler extracts urls from all the tags like link, script, embed, img, a etc.
      Write an exclude filter for ignoring all the css / js / images / audio / video formats from the urls.
      Also make sure you don't want to download urls that emits ZIP / TAR / GZ files.

      An example is provided for reference.
   */
  def excludeFilters = List(
    "(?i)(.*(\\.(pdf|flv|css|js|tar|gz|mp4))(\\?.*)*)$"
  )

  override def shouldVisit(url: WebURL): Boolean = {
    val urlStr = url.getURL
    !excludeFilters.exists(urlStr.matches)
  }

  override def visit(page: Page) {
    println(s"Fetched ${page.getWebURL.getURL} from ${page.getWebURL.getAnchor}")
    page.getParseData match {
      case data: HtmlParseData =>
        val result = parser.parse(data.getHtml, page.getWebURL.getURL)
        //if (result.isValidProductPage) {
          println(s"Parsed successfully as $result")
          writer.append(result.toCsv)
          writer.append("\n")
          writer.flush()
        //}
    }
  }

  override def onBeforeExit() {
    writer.close()
  }
}

class FlipkartCrawler extends BaseCrawler {
  override val parser: Parser = new FlipkartParser
}

class JabongCrawler extends BaseCrawler {
    override val parser: Parser = new JabongParser
}
