package implementation

import bc.{ByteCode, ByteCodeParser, ByteCodeValues}

import scala.collection.mutable.ListBuffer

/**
  * Created by pablo on 19/03/2017.
  */
class ByteCodeParserImpl extends ByteCodeParser {
  /**
    * Parses a vector of `Byte` into a vector of `ByteCode`.
    *
    * You should use [[ByteCodeValues.bytecode]] to help translate
    * the individual `Byte`s into a correponding [[ByteCode]].
    *
    * @param bc a vector of bytes representing bytecodes
    * @return a vector of `ByteCode` objects
    */
  override def parse(bc: Vector[Byte]): Vector[ByteCode] = {
    val bcf = new ByteCodeFactoryImpl
    var bcList = new ListBuffer[ByteCode]()
    /*for (i <- 0 until bc.length) {
      if (i > 0 && bc(i - 1).equals(bytecode("iconst")) && bc(i).equals()){}
      else{
        if (bc(i).equals(bytecode("iconst"))) {
          bcList += bcf.make(bc(i), bc(i + 1).toInt)
        } else {
          bcList += bcf.make(bc(i))
        }
      }
    }*/
    var i=0
    while (i<bc.length){
      if (bc(i).equals(bytecode("iconst"))) {
        bcList += bcf.make(bc(i), bc(i + 1).toInt)
        i+=1
      } else {
        bcList += bcf.make(bc(i))
      }
      i+=1
    }
    System.out.println(bcList)
    bcList.to[Vector]
  }

}
