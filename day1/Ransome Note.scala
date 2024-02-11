import scala.collection.mutable._
object Solution {
    def canConstruct(ransomNote: String, magazine: String): Boolean = {
        var mp= magazine.groupBy(identity).mapValues(_.length).to(Map)

         for(i<-ransomNote){
            if(!mp.contains(i) || mp(i)==0) return false; 
            mp(i)-=1;
        }
       
        return true;
    }
}
