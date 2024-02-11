object Solution {
    def climbStairs(n: Int): Int = {

        var(penultimate,ultimate,res)=(0, 1, 1);
        
        for(i <- 3 to n){
            res = penultimate+ultimate;
            penultimate = ultimate;
            ultimate = res;
        }
        res
    }
}
