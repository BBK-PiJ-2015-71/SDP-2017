package compute

/**
  * Created by User on 25/03/2017.
  */
class Counter(var count: Int) {
  def inc(){new Counter(count+1)}
  def dec(){new Counter(count-1)}

}

object computation extends App{
  println("test print")
  new Counter(10).inc()
}