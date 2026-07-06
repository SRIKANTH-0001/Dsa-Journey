import java.util.Arrays;

/** Input nums={2,0,2,1,1,0}
 *  output:  {0,0,1,1,2,2}
 *  */

public class Day_22_SortColors {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        int[] result=sortColors(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortColors(int[] nums){
        int left=0;
        int right=nums.length-1;
        int i=0;

        while(i<=right){
            if(nums[i]==0){
                swap(nums,i,left);
                i++;
                left++;
            }else if(nums[i]==2){
                swap(nums, i, right);
                right--;
            }else{
                i++;
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int nums1, int nums2) {
        int temp=nums[nums1];
        nums[nums1]=nums[nums2];
        nums[nums2]=temp;
    }
}
