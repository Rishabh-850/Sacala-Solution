import scala.collection.mutable.ArrayBuffer
object Solution {
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
        var arr:Array[Int] = new Array(m+n)
        var (i,j,k)=(0,0,0)
        while(i<m && j<n){
            if(nums1(i)<=nums2(j)) {arr(k)=nums1(i); k+=1; i+=1;}
            else {arr(k)=nums2(j); k+=1; j+=1;}
        }
        while(i<m){
            arr(k)=nums1(i);
            k+=1; i+=1;
        }
        while(j<n){
             arr(k)=nums2(j);
             k+=1; j+=1;
        }
        for(i<- 0 until arr.size){
            nums1(i)=arr(i);
        }
    }
}
