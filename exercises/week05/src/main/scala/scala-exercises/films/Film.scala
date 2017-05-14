package scala-exercises.films


/**
  * Created by User on 14/05/2017.
  */
class Film(val name: String,val  yearOfRelease:Int,val imdbRating: Double,val director: Director ) {

  def age() = this.yearOfRelease - director.yearOfBirth
  def isDirectedBy(dir : Director) = if(dir.firstName.equals(director.firstName) &&
    dir.lastName.equals(director.lastName)&& dir.yearOfBirth.equals(director.yearOfBirth)) true else false

  def copy(name1: String="Joy",yearOfRelease1:Int=1976 ,imdbRating1: Double=5,director1: Director=new Director("james","cameroon",1950)) ={
    new Film(name1,yearOfRelease1,imdbRating1,director1)
  }
}

object Film{
  def apply(name: String,yearOfRelease:Int,imdbRating: Double,director: Director) ={
    new Film(name, yearOfRelease,imdbRating,director)
  }
  def highestRating(f1: Film, f2: Film): Film ={
    if(f1.imdbRating >f2.imdbRating) f1 else f2
  }

  def oldestDirectorAtTheTime(f1: Film, f2: Film) ={
    if((f1.yearOfRelease-f1.director.yearOfBirth)>(f2.yearOfRelease-f2.director.yearOfBirth)) f1.director
    else f2.director
  }
}
