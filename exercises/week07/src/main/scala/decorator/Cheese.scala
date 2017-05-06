package decorator

class Cheese(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return pizza.getDesc + ". Cheese (20.72)"
  }

  def getPrice: Double = {
    return pizza.getPrice+20.72
  }
}
