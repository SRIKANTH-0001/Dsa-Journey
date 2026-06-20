//Problem No:136

/*
    Input:nums=[2,2,1]
    output:1
*/

public class Day_6_SingleVal {
    public static void main(String[] args) {
        int[] nums={1,2,2};
        int result=singleVal(nums);
        System.out.println(result);
    }

    public static int singleVal(int[] nums){
        int val=0;

        for(int i=0;i<nums.length;i++){
            val=val^nums[i];
        }

        return val;
    }
}
