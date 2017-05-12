package chain

case class TextFileHandler(s: String) extends Handler {

  var nextHandler: Handler=null

  override def setHandler(handler: Handler): Unit = nextHandler=handler

  override def process(file: File): Unit = {
    if(file.fileType.equals("text")) println("Process and saving text file... by Text Handler")
    else {
      println("Text Handler forwards request to Doc Handler")
      nextHandler.process(file)
    }
  }

  override def getHandlerName(): String = s
}
