package command

class LoggingJob extends Job {

  var log1: Logging = null

  def setLogging(logging: Logging): Unit = {
    logging.log
    log1 =logging
  }

  override def run(): Unit = {
    println("Job ID: " + Thread.currentThread.getId + " executing logging jobs.")
    log1.log
  }
}