import scala.collection.mutable.Stack;
object Solution {
    def decodeString(s: String): String = {
         var stknum=Stack[Int]()
         var stkstr=Stack[String]()
         var i=0;
         while(i<s.size){
             if(s(i).isDigit==true){
                  var dig=""
                  while(i<s.size && s(i).isDigit){
                  dig+=s(i); i+=1;
                }
                stknum.push(dig.toInt);
             }
            else if(s(i).isLetter || s(i)=='['){
                var alpha=""
                alpha+=s(i)
                stkstr.push(alpha)
                i+=1;
            }
            else{
                var temp="";
                while(stkstr.top!="["){
                    temp+=stkstr.top;
                    stkstr.pop;
                }
                if(stkstr.nonEmpty){
                    stkstr.pop
                }
                var res=""
                if(stknum.nonEmpty){
                    for(j<- 0 until stknum.top) res+=temp;
                    stknum.pop
                }
                stkstr.push(res);
                i+=1
            } 
         }
         var ans=""
         while(stkstr.nonEmpty){
             ans+=stkstr.top;
             stkstr.pop;
         }

         ans.reverse
    }
}
