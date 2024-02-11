import scala.collection.mutable.Stack
object Solution {
    def reverseWords(s: String): String = {
        var stk = Stack[String]() 
        s.trim()
        var (temp,res)=("","")
        for(i <- s){
            if(i.isLetter || i.isDigit){
                temp += i
            }else{
               if(temp!="") stk.push(temp)
               temp=""
            }
        }
        if(temp!="") stk.push(temp)
    
        while(!stk.isEmpty){
              res += stk.top;
              stk.pop;
              res+=" ";
        }
        res.trim()
    }
}
