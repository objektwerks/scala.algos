package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import A97.*

class A97Test extends AnyFunSuite with Matchers:
  test("find unpaired item") {
    findUnpairedItem(List(1, 2, 1)).get shouldBe 2
    findUnpairedItem(List(1, 2, 1, 1, 1)).get shouldBe 2
    findUnpairedItem(List(1, 1, 1, 1, 1)).get shouldBe 1
    findUnpairedItem(List(1, 1, 1, 1)).isEmpty shouldBe true
    findUnpairedItem(List(1, 2, 3, 1, 2)).get shouldBe 3
    findUnpairedItem(List(1, 2, 3, 3, 1, 2)).isEmpty shouldBe true
  }