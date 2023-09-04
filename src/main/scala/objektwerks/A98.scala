package objektwerks

object A98:
  def isEven(n: Int): Boolean = !isOdd(n)

  def isOdd(n: Int): Boolean = (n & 1) == 1