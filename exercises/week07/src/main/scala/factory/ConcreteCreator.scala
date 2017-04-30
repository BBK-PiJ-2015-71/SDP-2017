package factory

/**
  * Created by User on 30/04/2017.
  */
class ConcreteCreator extends Creator{
  override def makeProduct(): Product = {
    var product1 : Product = new ConcreteProduct
    return product1
  }
}
