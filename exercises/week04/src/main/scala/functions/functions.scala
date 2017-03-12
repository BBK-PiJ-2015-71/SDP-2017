package functions
import scala.collection.mutable.ListBuffer
import scala.math.max

object Funcs {

  // FUNCTIONAL BASICS:

  /**
    * tail that takes a list and removes the first element, returning the rest
    * of the list.
    * Calling tail on an empty list throws an IllegalArgumentException.
    *
    * @param ls : List[A] the list to process
    * @return A list containing all but the first element of ls
    */
  def tail[A](ls: List[A]): List[A] = ls match {
    case Nil => throw new IllegalArgumentException("Empty list")
    case _ => ls.tail
  }

  /**
    * setHead replaces the first value in a list with a given value. If the
    * list is empty, it adds the value to the front of the list.
    *
    * @param ls : List[A] the list to be changed
    * @param a  : A the value that will replace the head of ls
    * @return a list whose head is `a' and whose tail is all but the first
    *         element of ls.
    **/
  def setHead[A](ls: List[A], a: A): List[A] = ls match {
    case Nil => {val ls1=List(a); ls1 }
    case _ => {List(a):::ls.tail}
  }
  /**
    * drop removes n elements from the given list. If n is greater than the
    * length of the list, the function returns an empty list.
    *
    * @param ls : List[A] the list to be changed
    * @param n  : Int the number of elements to drop.
    * @return a list with the first n elements of ls removed, or an empty list.
    */
  def drop[A](ls: List[A], n: Int): List[A] = ls match {
    case Nil => Nil
    case _ => {
                n match {
                  case 0 => ls
                  case _ => drop(ls.tail, n-1)
                }
    }
  }

  /**
    * init takes a list and removes the last element.
    * Like tail, init(Nil) throws an IllegalArgumentException.
    * Implement this function recursively, preferably using match.
    *
    * @param ls : List[A] the list to be changed.
    * @return a list with the last element of ls removed.
    */
  def init[A](ls: List[A]): List[A] = ls match {
    case Nil => throw new IllegalArgumentException("Empty list")
    case _ => ls.dropRight(1)
  }

  // LIST FOLDING

  /*
   * foldLeft reduces a list down to a single value by iteratively applying a
   * function over the elements of the list and carrying the cumulative result
   * along.
   * We've provided the signature for foldLeft below.
   * @param ls: List[A] the list to be reduced.
   * @param z: B the initial value
   * @param f: (B, A) => B the binary function applied to the elements of the
   * list and the cumulative value.
   * @return the final valued.
   */
  def foldLeft[A, B](ls: List[A], z: B)(f: (B, A) => B): B = {
   ls.foldLeft(z)((r,c)=>f(r,c))
  }

  /**
    * Use your implementation of foldLeft to implement these functions:
    * - sum: Takes a List[Double] and produces the sum of all elements
    * - product: Takes a List[Double] and produces the product of all elements
    * - length: Takes a List[A] and finds the length of the list.
    * - reverse: Takes a List[A] and produces a new list with the elements of
    * the first list in reverse order. That is, reverse(List(1,2,3)) =
    * List(3,2,1).
    * - flatten: Takes a List[List[A]] and produces a List[A] by joining all
    * the sublists into one long list. For example, flatten(List(List(1,2,3),
    * List(4,5,6))) produces List(1,2,3,4,5,6).
    */
  def sum(ls: List[Double]): Double = {
    foldLeft(ls,0.0)((r,c)=>r+c)
  }

  def product(ls: List[Double]): Double = {
    foldLeft(ls,1.0)((r,c)=>r*c)
  }
  def length[A](ls: List[A]): Int = {
    foldLeft(ls,0)((r,c)=>r+1)
  }

  def reverse[A](ls: List[A]): List[A] = {
    foldLeft(ls,List[A]())((r,c)=>c::r)
  }

  def flatten[A](ls: List[List[A]]): List[A] = {
    foldLeft(ls,List[A]())((r,c)=>r:::c)
  }
  // MAP AND FILTER

  /**
    * map applies a function to a list, producing a new list of the functions'
    * values.
    * As with the other functions, implement this recursively.
    *
    * @param ls : List[A] the list to be changed.
    * @param f  : A => B the function to be applied to each element of the input.
    * @return the resulting list from applying f to each element of ls.
    */
  def map[A, B](ls: List[A])(f: A => B): List[B] = {
    var ls2 = new ListBuffer[B]()
    for(x<-0 to ls.length-1){ls2+=f(ls(x))}
    ls2.toList
  }

  /**
    * filter removes all elements from a list for which a given predicate
    * returns false.
    * As usual, this should be recursive.
    *
    * @param ls : List[A] the list to be filtered.
    * @param f  : A => Boolean the predicate
    * @return the filtered list.
    */
  def filter[A](ls: List[A])(f: A => Boolean): List[A] = {
    var ls2 = new ListBuffer[A]()
    for(x<-0 to ls.length-1){if(f(ls(x))==true) ls2+=ls(x) }
    ls2.toList
  }

  /**
    * flatMap is very similar to map. However, the function returns a List,
    * and flatMap flattens all of the resulting lists into one.
    *
    * @param ls : List[A] the list to be changed.
    * @param f  : A => List[B] the function to be applied.
    * @return a List[B] containing the flattened results of applying f to all
    *         elements of ls.
    */
  def flatMap[A, B](ls: List[A])(f: A => List[B]): List[B] = {
    var ls2 = new ListBuffer[B]()
    for(x<-0 to ls.length-1) {
      for (y <- 0 to f(ls(x)).length - 1){
        ls2+=f(ls(x))(y)
      }
    }
    ls2.toList
  }

  // COMBINING FUNCTIONS

  /**
    * maxAverage takes a List[(Double,Double)] (a list of pairs of real
    * numbers) and returns the average value of the largest value in each pair.
    * For example, the maxAverage of List((1,4), (8, 0)) is (8 + 4)/2 = 6.0.
    * You must use the methods you wrote above, particularly map and foldLeft.
    *
    * @param ls : List[(Double,Double)] a list of pairs of real numbers, whose
    *           length is greater than 0.
    * @return the average value of the largest values in the pairs.
    */
  def maxAverage(ls: List[(Double, Double)]): Double = {
    val ls2 = ls.map(a=>math.max(a._1,a._2))
    ls2.sum/ls2.length
  }

  /**
    * variance takes a List[Double] and calculates the squared distance
    * of each value from the mean. This is the *variance*, as used in
    * statistics.
    * 1) Find the mean M of the input.
    *
    * 2) For each value V in the input, calculate (V - M)^2.
    * 3) Find the variance.
    * Which methods that we've already defined can you use? (At least one!)
    * @param ls     : List[Double] a list of values, whose length is greater than 0.
    * @param return the variance of the input.
    */
  def variance(ls: List[Double]): Double = {
    val m=ls.sum/ls.length
    val ls2 = ls.map(a=>(a-m)*(a-m))
    ls2.sum/ls2.length

  }
}