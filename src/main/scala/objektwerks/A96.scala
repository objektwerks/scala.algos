package objektwerks

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