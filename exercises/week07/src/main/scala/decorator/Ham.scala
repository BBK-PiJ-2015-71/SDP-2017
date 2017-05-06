package decorator

class Ham(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return pizza.getDesc+ ". Ham (18.12)"
  }

  def getPrice: Double = {
    return pizza.getPrice+18.12
  }
}
