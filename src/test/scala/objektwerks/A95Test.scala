package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import A95.*

class A95Test extends AnyFunSuite with Matchers:
  test("containsBalancedParens") {
    containsBalancedParens("()") shouldBe true
    containsBalancedParens("(") shouldBe false
  }