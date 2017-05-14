package compute

import compute.Counter
import org.scalatest.FunSuite
/**
  * Created by User on 14/05/2017.
  */
class CounterTest extends Funsuite {

  // Basics
  test("Test for inc and dec methods of Counter") {
    assert(new Counter(10).inc.dec.inc.inc.count == 12)
  }


}
