import java.util.Arrays;

class Day_26_FindMaxProd{
    public static void main(String[] args) {
        int[] nums={1,2,4,7};
        int result=findMaxProd(nums);
        System.out.println(result);
    }

    public static int findMaxProd(int[] nums){
        Arrays.sort(nums);
        int first_large=nums.length-1;
        int second_large=nums.length-2;

        int res=(nums[first_large]-1)*(nums[second_large]-1);

        return res;
    }
}