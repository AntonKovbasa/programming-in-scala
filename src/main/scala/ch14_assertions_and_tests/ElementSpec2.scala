package ch14_assertions_and_tests

import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.wordspec.AnyWordSpec
import ch10_composition_and_inheritance.Element._

class ElementSpec2 extends AnyWordSpec with TableDrivenPropertyChecks {

  /*"elem result" must {
    "have passed width" in {
      forAll { (w: Int) =>
        whenever(w > 0) {
          elem('x', w, 3).width must equal(w)
        }
      }
    }
  }*/
}
