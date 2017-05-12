package chain

case class AudioFileHandler(s: String) extends Handler {

  var nextHandler: Handler=null

  override def setHandler(handler: Handler): Unit = nextHandler=handler

  override def process(file: File): Unit = {
    if(file.fileType.equals("audio")) println("Process and saving audio file... by Audio Handler")
    else {
      println("Audio Handler forwards request to Video Handler")
      nextHandler.process(file)
    }
  }

  override def getHandlerName(): String = s
}

