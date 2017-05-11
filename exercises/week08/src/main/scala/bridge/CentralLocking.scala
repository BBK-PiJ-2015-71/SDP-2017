package bridge

case class CentralLocking(s: String) extends Product {
// TODO
  override def productName: String = "Central Locking System"

  override def produce: Unit = println("Producing Central Locking System")
}
