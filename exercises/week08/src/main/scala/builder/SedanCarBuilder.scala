package builder

//TODO

object SedanCarBuilder extends CarBuilder {

  var car1 = Car("SEDAN")

  override def buildBodyStyle: Unit = car1.setBodyStyle("External dimensions: overall length (inches): 202.9,\n   overall width (inches): 76.2,"
    + "overall height (inches): 60.7,\n   wheelbase (inches): 112.9, front track (inches): 65.3,\n   rear track (inches): 65.5"
   + " and curb to curb turning circle (feet): 39.5")

  override def buildPower: Unit = car1.setPower("285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm")

  override def buildEngine: Unit = car1.setEngine("3.5L Duramax V 6 DOHC")

  override def buildBreaks: Unit = car1.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution")

  override def buildSeats: Unit = car1.setSeats("Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats")

  override def buildWindows: Unit = car1.setWindows("Laminated side windows.Fixed rear window with defroster")

  override def buildFuelType: Unit = car1.setFuelType("Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range")

  override def getCar: Car = car1
}
