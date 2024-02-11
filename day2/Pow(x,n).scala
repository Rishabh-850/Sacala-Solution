object Solution {
    def myPow(x: Double, n: Int): Double = {
        var res = 1.0
        var base=x.toDouble
        var exp=n.toLong;
        if(exp<0) exp = -1*exp;
        while(exp>0)
        {
            if(exp%2==1){
                res *= base;
                exp -= 1;
            }
            else{
                base *= base
                exp /= 2;
            }
        }
        if(n<0) res=1.0/res;       
        res;
    }
}
