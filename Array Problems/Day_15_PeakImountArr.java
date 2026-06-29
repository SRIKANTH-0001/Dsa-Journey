/**
 *  Problem No:852
 *  Peak index in a mountain Array
 *  
*     Input:arr=[0,10,50,20]
*     Output:1
 * 
 */
public class Day_15_PeakImountArr {
    public static void main(String[] args) {
        int[] arr={1,5,10,20,9,3,2};
        int n=arr.length;
        int start=0,end=n-1;
        int ans=0;

        while(start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                ans=mid;
                end=mid-1;
            }
        }
        System.out.println(ans);
        
    }
    
}