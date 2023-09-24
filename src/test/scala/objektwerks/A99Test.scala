package objektwerks

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

/**
  * Find the max profit in a list of Int.
  */
object A99:
  def maxProfit(prices: List[Int]): Option[Int] =
    val maxSellPrices = prices
      .view
      .scanRight(0) {
        (maxPrice, dayPrice) => Math.max(maxPrice, dayPrice)
      }
      .drop(1)

    if prices.length < 2 then None
    else
      prices
        .view
        .zip(maxSellPrices)
        .map {
          (buyPrice, sellPrice) => if sellPrice > buyPrice then Some(sellPrice - buyPrice) else None
        }
        .max

import A99.*

final class A99Test extends AnyFunSuite with Matchers:
  test("max profit"):
    maxProfit(List(163, 112, 105, 100, 151)).get shouldBe 51
    maxProfit(List(1)).isEmpty shouldBe true
    maxProfit(List(1, 2)).get shouldBe 1
    maxProfit(List(2, 1)).isEmpty shouldBe true