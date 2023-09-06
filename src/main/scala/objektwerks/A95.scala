package objektwerks

import scala.annotation.tailrec

/**
  * Assert a string contain balanced parens.
  */
object A95:
  def containsBalancedParens(string: String): Boolean =
    @tailrec
    def loop(remaining: String, openParens: Int): Boolean =
      if remaining.isEmpty then openParens == 0
      else if openParens == 0 && remaining.head == ')' then false
      else if remaining.head == '(' then loop(remaining.tail, openParens + 1)
      else loop(remaining.tail, openParens - 1)

    loop(string, 0)