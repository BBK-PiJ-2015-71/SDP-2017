package composite

import scala.collection.mutable.ListBuffer

abstract class HtmlTag(tagName: String) {

  var tagBody: String
  var childTags: ListBuffer[HtmlTag]


  def getTagName: String = tagName

  def setStartTag(tag: String)

  def setEndTag(tag: String)

  def setTagBody(tagBody: String) = this.tagBody=tagBody

  def addChildTag(htmlTag: HtmlTag) = childTags+=htmlTag

  def removeChildTag(htmlTag: HtmlTag) = if(!childTags.isEmpty) childTags-=htmlTag else println("Empty child list")

  def getChildren: List[HtmlTag] = childTags.toList

  def generateHtml
}