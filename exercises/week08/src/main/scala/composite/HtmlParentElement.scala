package composite

import scala.collection.mutable.ListBuffer

// TODO
case class HtmlParentElement(s: String) extends HtmlTag(s) {

  var tagBody: String
  var startTag: String
  var endTag: String

  override def setStartTag(tag: String): Unit = startTag=tag

  override def setEndTag(tag: String): Unit = endTag=tag

  override def generateHtml: Unit = {
    println(startTag)
    for(child<-childTags){
      for(child2<-child.childTags){
        child2.generateHtml
      }
      println(endTag)
    }
  }
}
