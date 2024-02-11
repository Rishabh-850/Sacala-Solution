import scala.collection.mutable
object Solution {
    def isAnagram(s: String, t: String): Boolean = {
        var mp = mutable.Map[Char,Int]()
        for(char <- s){
            if(mp.contains(char)) mp(char) += 1
            else mp(char) = 1
        }
        for(char <- t){
            if(!mp.contains(char) || mp(char)==0) return false
            else mp(char) -= 1
        }
        for(i<-mp.keys){
           if(mp(i)!=0) return false
        }
        true
    }
}
