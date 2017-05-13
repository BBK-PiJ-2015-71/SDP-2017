package command

class FileIOJob extends Job {

  var file1: FileIO = null

  def setFileIO(fileIO: FileIO): Unit = {
    fileIO.execute()
    file1=fileIO
  }

  override def run(): Unit = {
    println("Job ID: " + Thread.currentThread.getId + " executing fileIO jobs.")
    file1.execute()
  }
}