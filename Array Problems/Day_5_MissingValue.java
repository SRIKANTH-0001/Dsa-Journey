// Problem No:268

// Input:[3,0,1]

// Output:2


public class Day_5_MissingValue {
    public static void main(String[] args) {
        int[] nums={3,0,1};
        int result=missingValue(nums);
        System.out.println("The Missing Value is : "+result);
    }

    public static int missingValue(int nums[]){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }

        int actual_sum=n*(n+1)/2;

        int missingVal=actual_sum-sum;
        return missingVal;
    }
}