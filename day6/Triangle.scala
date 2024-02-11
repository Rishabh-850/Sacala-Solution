object Solution {
    def minimumTotal(triangle: List[List[Int]]): Int = {
        
        val memo = Array.fill(triangle.size)(Array.fill(triangle.last.size)(Integer.MAX_VALUE))
        
        for(level <- triangle.size-1 to 0 by -1;
            index <-level to 0 by -1){
            
            if( level == triangle.size-1 ){
                memo(level)(index) = triangle(level)(index)
            } else{
                memo(level)(index) = Math.min(triangle(level)(index) +  memo(level+1)(index),
                                         triangle(level)(index) +  memo(level+1)(index+1))
            }
            
        }
        
        memo(0)(0)
    }
}
