package bridge

// TODO

case class BigWheel(product: Product, s: String) extends Car(product, s) {
  override def assemble: Unit = super.assemble

  override def produceProduct: Unit = super.produceProduct

  override def printDetails: Unit = super.printDetails
}
