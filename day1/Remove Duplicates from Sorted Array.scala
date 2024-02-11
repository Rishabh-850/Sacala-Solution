object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        if(nums.size==0) 0
        var(i,j)=(0,1)
        while(j<nums.size){
            if(nums(j)!=nums(i)){
                i+=1
                nums(i)=nums(j)
            }
            j+=1
        }
        i+1
    }
}
