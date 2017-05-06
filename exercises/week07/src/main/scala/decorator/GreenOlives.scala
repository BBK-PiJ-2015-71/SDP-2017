package decorator

class GreenOlives(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return pizza.getDesc + ". Green Olives (5.47)"
  }

  def getPrice: Double = {
    return pizza.getPrice+5.47
  }
}
