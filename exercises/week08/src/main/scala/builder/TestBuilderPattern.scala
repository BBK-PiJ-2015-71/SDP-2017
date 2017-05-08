package builder

object TestBuilderPattern {
  def main(args: Array[String]) {
    var carBuilder: CarBuilder = SedanCarBuilder
    var director: CarDirector = CarDirector(carBuilder)

    director.build
    println(carBuilder.getCar.toString)

    carBuilder = SportsCarBuilder
    director = CarDirector(carBuilder)

    director.build
    println(carBuilder.getCar.toString)
  }
}
