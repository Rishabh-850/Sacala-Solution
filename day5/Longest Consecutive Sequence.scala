object Solution {
    def longestConsecutive(nums: Array[Int]): Int = {
        if(nums.size==0) return 0;
        var num=nums.sorted
        var (counter, res)=(1,-1)
        for(i <- 0 until num.size-1){
            if(num(i+1)-num(i)==1) counter+=1
            else if(num(i+1)==num(i)){}
            else{
                res= res max counter
                counter=1
            }
        }
         res= res max counter
         res
    }
}
