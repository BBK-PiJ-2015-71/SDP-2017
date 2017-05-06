package decorator

class RomaTomatoes(val pizza: Pizza) extends Pizza {
  def getDesc: String = {
    return pizza.getDesc + ". Roma Tomatoes (5.20)"
  }

  def getPrice: Double = {
    return pizza.getPrice+5.20
  }
}
