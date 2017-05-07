package abstractfactory

/**
  * Created by User on 07/05/2017.
  */
class NYCErrorXMLParser extends XMLParser {
  override def parse: String = "NYC Parsing error XML...\n" + "NYC Error XML Message"
}
