object Solution {
    def dfs(grid: Array[Array[Char]], i:Int, j:Int, row: Int, col:Int): Unit={
        if(i<0 || i>=row || j<0 || j>=col || grid(i)(j)=='0') return;
        grid(i)(j)='0'
        dfs(grid,i+1,j,row,col)
        dfs(grid,i,j+1,row,col)
        dfs(grid,i-1,j,row,col)
        dfs(grid,i,j-1,row,col)
    }
    def numIslands(grid: Array[Array[Char]]): Int = {
        var(row,col,res)=(grid.size, grid(0).size,0)
        for(i<- 0 until row; j<- 0 until col){
                if(grid(i)(j)=='1'){
                    res+=1;
                    dfs(grid, i,j, row, col);
                }
        }
        res
    }
}
