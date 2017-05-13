package command

class SmsJob extends Job {

  var sms1: Sms = null

  def setSms(sms: Sms): Unit = {
    sms.sendSms
    sms1=sms
  }

  override def run(): Unit = {
    println("Job ID: " + Thread.currentThread.getId + " executing sms jobs.")
    sms1.sendSms
  }
}