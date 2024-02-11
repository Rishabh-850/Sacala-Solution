object Solution {
    def maxProfit(prices: Array[Int], fee: Int): Int = {
        var res = 0
        var acc = -prices.head
        prices.foreach(f=>{
          res = res max (acc + f - fee)
          acc = acc max (res - f)
        })
        res
    }
}
