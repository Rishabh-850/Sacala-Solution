object Solution {
    def rob(nums: Array[Int]): Int = {
        if(nums.size <2) return nums(0)
        var memo=Array.fill[Int](400)(-1);
        memo(0)=nums(0)
        memo(1)=nums(0) max nums(1)
        for(i <- 2 until nums.size){
            memo(i)= memo(i-2) + nums(i) max memo(i-1)
        }
        memo(nums.size-1)
    }
}
