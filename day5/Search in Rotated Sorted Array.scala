object Solution {
    def search(nums: Array[Int], target: Int): Int = {
        var(mid,start,end)=(-1,0,nums.size-1)
        while(start<=end){
            mid=(start+end)/2
            if(nums(mid)==target) return mid
            if(nums(start)<=nums(mid)){
                if(nums(start)<=target && target <= nums(mid)) end=mid-1
                else start=mid+1
            }
            else{
                if(nums(mid)<=target && target<=nums(end)) start=mid+1
                else end=mid-1
            }
        }
        -1
    }
}
