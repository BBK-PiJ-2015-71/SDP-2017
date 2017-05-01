package observer

import scala.collection.mutable.ListBuffer

class CommentaryObject(var subscribers: ListBuffer[Observer], val title: String) extends Subject {

  var comment: String = ""

  def subscribeObserver(observer: Observer): Unit = {
    subscribers+=observer
  }

  def unSubscribeObserver(observer: Observer) = {
    subscribers-=observer
  }

  def notifyObservers() = {
    for(obs <- subscribers){
      obs.update(comment)
    }
  }

  def subjectDetails: String = {
    return title
  }

  def updateCommentary(str: String): Unit = {
    comment = str
    notifyObservers()
  }
}
