package ch14_assertions_and_tests

import ch10_composition_and_inheritance.Element._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class ElementSpec extends AnyFlatSpec with Matchers {

  "A UniformElement" should "have a width equal to the passed value" in {
    val ele = elem('x', 2, 3)
    ele.width should be(2)
  }
  it should "have a height equal to the passed value" in {
    val ele = elem('x', 2, 3)
    ele.height should be(3)
  }
  it should "throw an IAE if passed a negative width" in {
    an[IllegalArgumentException] should be thrownBy {
      elem('x', -2, 3)
    }
  }

}
