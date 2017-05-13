package command

class EmailJob extends Job {

  var email1: Email =null

  def setEmail(email: Email): Unit = {
    email.sendEmail()
    email1=email
  }

  override def run(): Unit = {
    println("Job ID: " + Thread.currentThread.getId + " executing email jobs.")
    email1.sendEmail()
  }
}