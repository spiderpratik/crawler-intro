crawler-intro Assignment
========================

The purpose of this assignment is to get started with Crawler4J and Scala. 

## Deliverables

* Link to your fork of this assignment
* Final CSV file containing atleast 100 product information details.

## Changes to be done in the code

* Support for css / js / image / other junk exclude filters. (Check BaseCrawler.scala)
* Add Crawler for the site (will be sent separately in the email)
* Support for Proxy (check CrawlDriver.scala) - If everybody starts crawling from office, the site can identify that and block us. Since all outgoing requests originate from the same IP. Will share the proxy details in the email separately. 
* Parser unit tests for the new site(s). 
* Fix the existing unit test for Flipkart as well. 

## How Proxy works

- http://en.wikipedia.org/wiki/Proxy_server
- http://computer.howstuffworks.com/firewall4.htm

Crawler4J Source Code - http://code.google.com/p/crawler4j/source/browse/

