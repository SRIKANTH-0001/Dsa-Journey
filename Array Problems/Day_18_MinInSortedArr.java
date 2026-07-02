public class Day_18_MinInSortedArr {
    public static void main(String[] args) {
        int[] nums={4,5,0,1,2,3};
        int result=minInRSortarr(nums);
        System.out.println(result);
    }
    
    public static int minInRSortarr(int[] nums){
        int n=nums.length;
        int start=0;
        int end=n-1;
        int result=5000;
        while (start<=end) {
            int mid=(start+end)/2;
            if(result>nums[mid]){
                result=nums[mid];
            }
            if(nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return result;
    }
}
