package iterator

import java.util.Iterator
import scala.collection.mutable.ArrayBuffer

class ShapeIterator(private var shapes: Array[Shape]) extends Iterator[Shape] {

  var shapes2 = shapes.to[ArrayBuffer]
  var i: Int=0


  override def hasNext(): Boolean = if(!shapes2.isEmpty && i<(shapes2.length)) true else false

  override def next(): Shape = {
    if(this.hasNext()) { i=i+1; shapes2(i-1) } else null

  }

  override def remove(): Unit =  if(!shapes2.isEmpty && i<=(shapes2.length-1)) shapes2.remove(i)
}