package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import A99.*

class A99Test extends AnyFunSuite with Matchers:
  test("find max profit") {
    findMaxProfit(List(163, 112, 105, 100, 151)).get shouldBe 51
    findMaxProfit(List(1)).isEmpty shouldBe true
    findMaxProfit(List(1, 2)).get shouldBe 1
    findMaxProfit(List(2, 1)).isEmpty shouldBe true
  }