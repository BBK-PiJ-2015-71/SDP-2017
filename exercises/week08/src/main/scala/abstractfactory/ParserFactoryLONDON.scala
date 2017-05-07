package abstractfactory

/**
  * Created by User on 07/05/2017.
  */
class ParserFactoryLONDON extends AbstractParserFactory {
  override def getParserInstance(parserType: String): XMLParser = {
    var parser : XMLParser = new LondonFeedbackXMLParser
    if(parserType.equals("LondonFEEDBACK")){
      parser = new LondonFeedbackXMLParser

    } else if(parserType.equals("LondonERROR")){
      parser= new LondonErrorXMLParser
    } else if(parserType.equals("LondonORDER")){
      parser= new LondonOrderXMLParser
    } else if(parserType.equals("LondonRESPONSE")){
      parser= new LondonResponseXMLParser
    }
    parser
  }
}
