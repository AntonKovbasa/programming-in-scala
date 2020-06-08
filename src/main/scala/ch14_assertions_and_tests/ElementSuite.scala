package ch14_assertions_and_tests

import ch10_composition_and_inheritance.Element.elem
import org.scalatest.diagrams.Diagrams
import org.scalatest.funsuite.AnyFunSuite

class ElementSuite extends AnyFunSuite {

  test("elem result should have passed width") {
    val ele = elem('x', 2, 3)
    assert(ele.width == 2)
  }

  test("Diagrammed assertion") {
    Diagrams.assert(List(1, 2, 3).contains(4))
  }

  test("assertResult") {
    val ele = elem('x', 3, 3)
    assertResult(2) {
      ele.width
    }
  }

  test("assertTrows") {
    assertThrows[IllegalArgumentException] {
      elem('x', -2, 3)
    }
  }


  test("intercept") {
    val caught = intercept[ArithmeticException] {
      1 / 0
    }
    assert(caught.getMessage == "/ by zero")
  }

}
