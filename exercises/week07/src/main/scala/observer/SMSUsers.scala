package observer

class SMSUsers(s: Subject, msg: String) extends Observer {

  def update(desc: String): Unit = {
    println("User : " + msg , "Match: "+ s.subjectDetails,  " Commentary update: "+ desc)
  }

  def subscribe(): Unit = {
    s.subscribeObserver(this)
  }

  def unSubscribe(): Unit = {
    s.unSubscribeObserver(this)
  }
}
