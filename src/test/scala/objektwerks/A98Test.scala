package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

import scala.annotation.tailrec

/**
  * Find the max sequence of zeros, between two 1s, in the binary representation of an Int.
  */
object A98:
  private def isEven(n: Int): Boolean = !isOdd(n)

  private def isOdd(n: Int): Boolean = (n & 1) == 1

  @tailrec
  def removeRightZeroes(number: Int): Int =
    if number == 0 then 0
    else if isOdd(number) then number
    else removeRightZeroes(number >> 1)

  def maxSeqOfZeroes(n: Int): Option[Int] =
    if n <= 0 then None
    else
      val numberStartingWith1 = removeRightZeroes(n)

      @tailrec
      def loop(currentNumber: Int,
               currentCount: Int,
               zeroGapCounts: List[Int]): Option[Int] =
      if currentNumber == 1 then (currentCount :: zeroGapCounts).maxOption.filter(_ > 0)
      else if isEven(currentNumber) then loop(currentNumber >> 1, currentCount + 1, zeroGapCounts)
      else loop(currentNumber >> 1, 0, currentCount :: zeroGapCounts)
      
      loop(numberStartingWith1, 0, Nil)

import A98.*

class A98Test extends AnyFunSuite with Matchers:
  test("max seq of zeroes") {
    removeRightZeroes(12) shouldBe 3
    maxSeqOfZeroes(6217).contains(4)
    maxSeqOfZeroes(16).isEmpty
    maxSeqOfZeroes(1).isEmpty
  }