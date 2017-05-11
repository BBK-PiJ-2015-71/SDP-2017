package bridge

abstract class Car(product: Product, carType: String) {

  def assemble = {
    println("Modifying product "+product.productName+" according to "+carType)
    println("Assembling "+product.productName+" for "+carType)
  }

  def produceProduct = product.produce

  def printDetails = {
    println("Car: "+carType+", Product:"+product.productName)
  }
}
