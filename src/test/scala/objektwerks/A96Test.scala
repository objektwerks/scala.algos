package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

/**
  * A palindrome is a sequence of items that are identical when reversed.
  * For instance, 'aabb' is not a palindrome. But 'aba' is a palindrome.
  * 
  * Assert a list of T contains a palidrome.
  */
object A96:
  def isPalindrome[T](list: List[T]): Boolean =
    list
      .view
      .zip(list.reverse)
      .forall { case (a, b) => a == b }

import A96.* 

final class A96Test extends AnyFunSuite with Matchers:
  test("is palindrome"):
    isPalindrome( List('a', 'a', 'b', 'b')) shouldBe false
    isPalindrome( List('a', 'b', 'a')) shouldBe true