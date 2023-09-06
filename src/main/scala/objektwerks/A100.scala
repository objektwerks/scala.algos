package objektwerks

/**
  * For an Int, return a String of:
  * 1. if int divisible by 15 ( 3 * 5 ) return "fizzbuzz"
  * 2. else if int divisible by 3 return "fizz"
  * 3. else if int divisible by 5 return "buzz"
  * 4. else return int
  */
object A100:
  def fizzbuzz(n: Int): String =
    n match 
      case i if i % 15 == 0 => "fizzbuzz"
      case j if j % 3 == 0 => "fizz"
      case k if k % 5 == 0 => "buzz"
      case _ => s"$n"