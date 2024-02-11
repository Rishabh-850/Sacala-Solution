object Solution {
    def isPalindrome(s: String): Boolean = {
       var i=0;
       var j=s.length-1;
        while(i<j){
           if(!s(i).isDigit && !s(i).isLetter){i+=1;}
           if(!s(j).isDigit && !s(j).isLetter){j-=1;}
           if(s(i).toLower!=s(j).toLower) return false;
           else{
               i+=1;
               j-=1;
           }
        }

      return true;
    }
}
