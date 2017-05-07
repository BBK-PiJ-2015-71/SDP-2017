package abstractfactory

/**
  * Created by User on 07/05/2017.
  */
class ParserFactoryNYC extends AbstractParserFactory{
  override def getParserInstance(parserType: String): XMLParser = {
    var parser : XMLParser = new NYCOrderXMLParser
    if(parserType.equals("NYCORDER")){
      parser= new NYCOrderXMLParser
    } else if(parserType.equals("NYCERROR")){
      parser= new NYCErrorXMLParser
    } else if(parserType.equals("NYCFEEDBACK")){
      parser= new NYCFeedbackXMLParser
    } else if(parserType.equals("NYCRESPONSE")){
      parser= new NYCResponseXMLParser
    }
    parser
  }
}
