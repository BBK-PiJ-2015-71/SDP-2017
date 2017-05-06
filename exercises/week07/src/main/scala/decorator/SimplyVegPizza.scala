package decorator

class SimplyVegPizza extends Pizza {
  def getDesc: String = {
    return "SimplyVegPizza (230). "
  }

  def getPrice: Double = {
    return 230
  }
}
