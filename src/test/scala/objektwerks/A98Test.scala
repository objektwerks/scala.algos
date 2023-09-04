package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import A98.*

class A98Test extends AnyFunSuite with Matchers:
  test("max seq of zeroes") {
    removeRightZeroes(12) shouldBe 3
    maxSeqOfZeroes(6217).contains(4)
    maxSeqOfZeroes(16).isEmpty
    maxSeqOfZeroes(1).isEmpty
  }