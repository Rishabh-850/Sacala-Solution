object Solution {
    def threeSum(nums: Array[Int]): List[List[Int]] = {
        nums.sortInPlace()
 
        var res = List[List[Int]]();
        var i = 0;
        while(i< nums.length) {
            while(i>0 && i<nums.length && nums(i) == nums(i-1)) i+=1;
            if(i >= nums.length) return res;
            var target = -nums(i);
            var low = i+1;
            var high = nums.length-1;
 
            while(low<high) {
                var sum = nums(low) + nums(high);
                if(sum == target) {
                    var triplet = List[Int](nums(i), nums(low), nums(high))
                    res = res ::: List(triplet)
                    low+=1;
                    while(low<high && nums(low) == nums(low-1)) low+=1;
                    high-=1;
                    while(high>low && nums(high) == nums(high+1)) high-=1;
                }else if(sum>target) {
                    high-=1;
                }else {
                    low+=1;
                }
            }
            i+=1;
        }
        res
    }
}
