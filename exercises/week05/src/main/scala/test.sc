1+2

case class Counter(var count: Int=0) {

  def inc(): Counter = {new Counter(count+1)}
  def inc(i: Int=1): Counter = {new Counter(count+i)}

  def dec(): Counter = {new Counter(count-1)}
  def dec(i: Int=1): Counter = {new Counter(count-i)}

  override def toString(): String = {
    "count is "+count
  }
}

new Counter(15).count
new Counter(7).inc(3).dec
new Counter().inc.count
Counter(5).inc.count

object computation extends App{
  println("test print")
  new Counter(10).inc()
  println(new Counter(1))

}


case class Person(val name: String) {

  private var firstname: String =""
  private var lastname : String = ""
  override def toString: String = "firstname : "+ firstname + " , lastname : " + lastname

}

object Person{
  def apply(base: String) ={
    val person1= new Person(base)
    val parts = base.split(" ")
    person1.firstname = parts(0)
    person1.lastname = parts(1)
    person1
  }
}

Person("ullash hazarika")