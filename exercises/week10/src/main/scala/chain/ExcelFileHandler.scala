package chain

case class ExcelFileHandler(s: String) extends Handler {

  var nextHandler: Handler=null

  override def setHandler(handler: Handler): Unit = nextHandler=handler

  override def process(file: File): Unit = {
    if(file.fileType.equals("doc")) println("Process and saving excel file... by Excel Handler")
    else {
      println("Excel Handler forwards request to Audio Handler")
      nextHandler.process(file)
    }
  }

  override def getHandlerName(): String = s
}
