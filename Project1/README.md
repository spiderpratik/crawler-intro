Crawler Assignment
========================

The purpose of this assignment is to get started in Crawler4J with Scala. 

## Deliverables

* Link to your fork of this assignment (Yes you need to fork this project and make changes on your repo) with the changes (refer next section for the changes)
* Final CSV file containing atleast 100 product information details.

## Changes to be done in the code

* Support for css / js / image / other junk exclude filters. (Check **BaseCrawler.scala**)
* Add Crawler for the site (site name will be sent separately in the email)
* Support for Proxy (check **CrawlDriver.scala**) - If everybody starts crawling from office, the site can identify that and block our IP Address. Since all outgoing requests originate from the same IP. Will share the proxy details in the email separately. 
* Parser unit tests for the new site(s). 
* Fix the existing unit test for Flipkart as well. 

## Resources

- [JSoup CSS Selector Syntax](http://jsoup.org/cookbook/extracting-data/selector-syntax)
- [Crawler4J Source Code](http://code.google.com/p/crawler4j/source/browse/)
- [Proxy Server](http://en.wikipedia.org/wiki/Proxy_server)
- http://computer.howstuffworks.com/firewall4.htm

## More Resources on CSS Selectors

- [MDN CSS Selector](https://developer.mozilla.org/en-US/docs/Web/Guide/CSS/Getting_started/Selectors)
- [document.querySelector](https://developer.mozilla.org/en-US/docs/Web/API/document.querySelector)
- [W3 Selector Draft](http://www.w3.org/TR/selectors-api/)
- [30 Selectors you need to know](http://code.tutsplus.com/tutorials/the-30-css-selectors-you-must-memorize--net-16048)


