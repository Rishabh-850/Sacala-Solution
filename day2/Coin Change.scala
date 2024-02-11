object Solution {
    def coinChange(coins: Array[Int], amount: Int): Int = {
        var memo=Array.fill[Int](amount+1)(Int.MaxValue)
        memo(0) = 0
        for(amt<- 1 to amount){
            for(coin <- coins){
                if(coin<=amt && memo(amt-coin)!=Int.MaxValue){
                    memo(amt)=Math.min(memo(amt), 1+ memo(amt-coin))
                }
            }
        }
       if(memo(amount)==Int.MaxValue) return -1;
       memo(amount)
    }
}
