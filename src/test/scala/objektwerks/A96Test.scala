package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import A96.* 

class A96Test extends AnyFunSuite with Matchers:
  test("is palindrome") {
    isPalindrome( List('a', 'a', 'b', 'b')) shouldBe false
    isPalindrome( List('a', 'b', 'a')) shouldBe true
  }