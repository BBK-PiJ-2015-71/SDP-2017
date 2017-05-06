package decorator

class Spinach(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return pizza.getDesc + ". Spinach (7.92)"
  }

  def getPrice: Double = {
    return pizza.getPrice+7.92
  }
}
