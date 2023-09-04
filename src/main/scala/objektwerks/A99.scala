package objektwerks

/**
  * Find an max profit in a list of prices.
  */
object A99:
  def findMaxProfit(prices: List[Int]): Option[Int] =
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