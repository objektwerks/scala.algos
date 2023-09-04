package objektwerks

import scala.annotation.tailrec

/**
  * Find the max sequence of zeros in the binary representation of an integer.
  */
object A98:
  def isEven(n: Int): Boolean = !isOdd(n)

  def isOdd(n: Int): Boolean = (n & 1) == 1

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
               gapCounts: List[Int]): Option[Int] =
      if currentNumber == 1 then (currentCount :: gapCounts).maxOption.filter(_ > 0)
      else if isEven(currentNumber) then loop(currentNumber >> 1, currentCount + 1, gapCounts)
      else loop(currentNumber >> 1, 0, currentCount :: gapCounts)
      
      loop(numberStartingWith1, 0, Nil)