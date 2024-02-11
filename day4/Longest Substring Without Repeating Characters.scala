import scala.collection.mutable
object Solution {
    def lengthOfLongestSubstring(s: String): Int = {
        var mp = mutable.Map[Char,Int]()
        var (res,left,right)=(0,0,0)

        while(right< s.size){
            if(!mp.contains(s(right)))  mp(s(right)) =1
            else mp(s(right))+=1;
            while(mp(s(right))> 1){
                mp(s(left))-= 1;
                left += 1;
            }
            res= res.max(right-left +1 )
            right +=1
        }
        res
    }
}
