package chain

case class DocFileHandler(s: String) extends Handler {

  var nextHandler: Handler=null

  override def setHandler(handler: Handler): Unit = nextHandler=handler

  override def process(file: File): Unit = {
    if(file.fileType.equals("doc")) println("Process and saving doc file... by Doc Handler")
    else {
      println("Doc Handler forwards request to Excel Handler")
      nextHandler.process(file)
    }
  }

  override def getHandlerName(): String = s
}
