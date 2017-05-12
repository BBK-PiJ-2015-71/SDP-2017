package chain

case class VideoFileHandler(s: String) extends Handler {

  var nextHandler: Handler=null

  override def setHandler(handler: Handler): Unit = nextHandler=handler

  override def process(file: File): Unit = {
    if(file.fileType.equals("video")) println("Process and saving video file... by Video Handler")
    else {
      println("Video Handler forwards request to Image Handler")
      nextHandler.process(file)
    }
  }

  override def getHandlerName(): String = s
}
