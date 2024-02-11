import scala.collection.mutable
object Solution {
    def solve(s:String, idx:Int, mp:mutable.Map[String,Int],memo:Array[Int]): Int={
        if(idx==s.size) return 1;
        if(memo(idx)!= -1) return memo(idx);
        var temp="";
        var res=0;
        for(i<- idx until s.size){
            temp+=s(i);
            if(mp.contains(temp)){
                if(solve(s,i+1,mp,memo)==1){
                    res=1;
                }
            }
        }
        memo(idx)=res;
        return res
    }
    def wordBreak(s: String, wordDict: List[String]): Boolean = {
        var mp = mutable.Map[String,Int]();
        var memo=Array.fill[Int](400)(-1);
        for(i<- wordDict){
           if(mp.contains(i)) mp(i)+=1;
           else mp(i)=1;
        }
        if(solve(s,0,mp,memo)==1) return true;
        false;
    }
}
