package objektwerks

/**
  * For a number, output:
  * 1. if number divisible by 15 ( 3 * 5 ) return "fizzbuzz"
  * 2. else if numbber divisible by 3 return "fizz"
  * 3. else if number divisible by 5 return "buzz"
  * 4. else return number
  */
object A100:
  def fizzbuzz(n: Int): String =
    n match 
      case i if i % 15 == 0 => "fizzbuzz"
      case j if j % 3 == 0 => "fizz"
      case k if k % 5 == 0 => "buzz"
      case _ => s"$n"