package compute

/**
  * Created by User on 14/05/2017.
  */
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

