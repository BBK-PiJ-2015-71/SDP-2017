package compute

/**
  * Created by User on 25/03/2017.
  */
class Counter(var count: Int = 0) {

  def inc(): Counter = {new Counter(count+1)}
  def inc(i: Int=1): Counter = {new Counter(count+i)}

  def dec(): Counter = {new Counter(count-1)}
  def dec(i: Int=1): Counter = {new Counter(count-i)}

  def adjust(adder1: Adder): Counter= {new Counter(adder1.add(this.count))}

  override def toString(): String = {
    "count is "+count
  }

}

object computation extends App{
  println("test print")
  new Counter(10).inc
  println(new Counter(10).inc.dec.inc.inc.count)
  println(new Counter(10).inc(2).dec.inc.inc.count)
  println(new Counter(10).adjust(new Adder(2)).count )

}