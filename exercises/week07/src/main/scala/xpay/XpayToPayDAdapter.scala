package xpay

/**
  * Created by User on 01/05/2017.
  */
class XpayToPayDAdapter extends PayD{

  val payObject: Xpay = new XpayImpl

  override def getCustCardNo: String = payObject.getCreditCardNo

  override def setCustCardNo(custCardNo: String): Unit = payObject.setCreditCardNo(custCardNo)

  override def getCardOwnerName: String = payObject.getCustomerName

  override def setCardOwnerName(cardOwnerName: String): Unit = payObject.setCustomerName(cardOwnerName)

  override def getCardExpMonthDate: String = payObject.getCardExpMonth

  override def setCardExpMonthDate(cardExpMonthDate: String): Unit = payObject.setCardExpMonth(cardExpMonthDate)

  override def getCVVNo: Integer = payObject.getCardCVVNo.toInt

  override def setCVVNo(cVVNo: Integer): Unit = payObject.setCardCVVNo(cVVNo.toShort)

  override def getTotalAmount: Double = payObject.getAmount

  override def setTotalAmount(totalAmount: Double): Unit = payObject.setAmount(totalAmount)
}
