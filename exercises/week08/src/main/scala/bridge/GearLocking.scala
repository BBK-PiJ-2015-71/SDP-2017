package bridge

case class GearLocking(s: String) extends Product {
// TODO

  override def productName: String = "Gear Locking System"

  override def produce: Unit = println("Producing Gear Locking System")
}
