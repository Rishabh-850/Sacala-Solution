object Solution {
    def maxArea(height: Array[Int]): Int = {
        var (ans,n)=(-1,height.size);
        var (i,j)=(0,n-1)
        while(i<j){
            var area=((j-i)*(Math.min(height(i),height(j))));
            ans=Math.max(ans,area);
            if(height(i)<height(j)){
                i+=1;
            }else{
                j-=1;
            }
        }
        return ans;
    }
}
