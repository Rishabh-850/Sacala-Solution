import scala.collection.mutable
object Solution {
    def containsNearbyDuplicate(nums: Array[Int], k: Int): Boolean = {
        var mp = mutable.Map[Int,Int]()
        for(i<- 0 until nums.size){
            if(mp.contains(nums(i))) {
                if(i-mp(nums(i))<=k) return true
            }
            mp(nums(i))=i
        }
        false
    }
}
