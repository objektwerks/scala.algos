package objektwerks

import scala.annotation.tailrec

/**
  * Does string contain balanced parens?
  */
object A98:
  def isEven(n: Int): Boolean = !isOdd(n)

  def isOdd(n: Int): Boolean = (n & 1) == 1

  @tailrec
  def removeRightZeroes(number: Int): Int =
    if (number == 0) then number
    else if (isOdd(number)) then number
    else removeRightZeroes(number >> 1)