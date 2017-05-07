package abstractfactory

object ParserFactoryProducer {
  def getFactory(s: String) : AbstractParserFactory = {
    var factory:AbstractParserFactory=new ParserFactoryNYC
    if(s.equals("NYCFactory")){
      factory= new ParserFactoryNYC

    } else if(s.equals("LondonFactory")){
      factory = new ParserFactoryNYC

    }
    factory
  }



}
