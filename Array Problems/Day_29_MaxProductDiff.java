import java.util.Arrays;

/**
 * Day_29_MaxProductDiff
 */
public class Day_29_MaxProductDiff {

    public static void main(String[] args) {
        int[] nums={5,6,2,7,4};
        Arrays.sort(nums);

        int a=nums[0];
        int b=nums[1];

        int c=nums[nums.length-1];
        int d=nums[nums.length-2];

        int result=(c*d)-(a*b);
        System.out.println(result);
    }
}