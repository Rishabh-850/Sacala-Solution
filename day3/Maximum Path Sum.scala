object Solution {
    def minPathSum(grid: Array[Array[Int]]): Int = {
       var (row,col)=(grid.size, grid(0).size)
       
       for(i<- 1 until col){
           grid(0)(i)+=grid(0)(i-1)
       } 
       for(i<- 1 until row ){
           grid(i)(0)+=grid(i-1)(0)
       }
       for(i<- 1 until row){
           for(j <- 1 until col){
               grid(i)(j)+=Math.min(grid(i-1)(j), grid(i)(j-1));
           }
       }
       grid(row-1)(col-1)
    }
}
