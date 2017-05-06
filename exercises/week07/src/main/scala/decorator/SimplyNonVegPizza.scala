package decorator

class SimplyNonVegPizza extends Pizza {
  def getDesc: String = {
    return "SimplyNonVegPizza (350)"
  }

  def getPrice: Double = {
    return 350
  }
}
