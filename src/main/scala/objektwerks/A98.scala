package objektwerks

import scala.annotation.tailrec

/**
  * Find longest sequence of zeros in binary representation of an integer.
  */
object A98:
  def isEven(n: Int): Boolean = !isOdd(n)

  def isOdd(n: Int): Boolean = (n & 1) == 1

  @tailrec
  def removeRightZeroes(number: Int): Int =
    if (number == 0) then number
    else if (isOdd(number)) then number
    else removeRightZeroes(number >> 1)

  def maxBinaryGap(n: Int): Option[Int] =
    if (n <= 0) then None
    else
      val numberStartingWith1 = removeRightZeroes(n)

      @tailrec
      def iterate(currentNumber: Int,
                  currentCount: Int,
                  gapCounts: List[Int]): Option[Int] =
      if (currentNumber == 1) then (currentCount :: gapCounts).maxOption.filter(_ > 0)
      else if (isEven(currentNumber)) then iterate(currentNumber >> 1, currentCount + 1, gapCounts)
      else iterate(currentNumber >> 1, 0, currentCount :: gapCounts)
      
      iterate(numberStartingWith1, 0, Nil)