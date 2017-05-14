package scala-exercises.films



/**
  * Created by User on 14/05/2017.
  */
class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {
  def name():String = firstName + " " + lastName
}

object Director{
  def apply(firstName: String, lastName: String, yearOfBirth: Int) ={
    new Director(firstName,lastName,yearOfBirth)
  }
  def older(dir1: Director, dir2: Director): Director ={
    if(dir1.yearOfBirth>dir2.yearOfBirth) dir2 else dir1
  }
}
