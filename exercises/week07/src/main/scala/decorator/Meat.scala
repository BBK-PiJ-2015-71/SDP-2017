package decorator

class Meat(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return pizza.getDesc + ". Meat (14.25)"
  }

  def getPrice: Double = {
    return pizza.getPrice+14.25
  }
}
