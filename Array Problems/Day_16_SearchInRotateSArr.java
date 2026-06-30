/**
 *  Problem No:33 Search an element in sorted rotated Array
 *  Input:num=[4,5,6,7,0,1,2];
 *  Output:4
 */

public class Day_16_SearchInRotateSArr {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=11;
        int result=SearchInRotateSArr(nums,target);
        System.out.println(result);
    }

    public static int SearchInRotateSArr(int[] nums,int target){
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==nums[mid]){
                return mid;
            }

            if(nums[start]<=nums[mid]){
                if(target>=nums[start]&&target<nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                 if(target>=nums[mid]&&target<=nums[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
