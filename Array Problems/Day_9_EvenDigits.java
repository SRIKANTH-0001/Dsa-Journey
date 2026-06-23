// Problem No:1295

// Sample Input:nums=[12,345,3,5,7894]
// Sample Output:2


public class Day_9_EvenDigits {
    public static void main(String[] args) {
        int[] nums={12,345,3,5,7894};
        int result=evenDigit(nums);
        System.out.println(result);
    }

    public static int evenDigit(int[] nums){
        int n=nums.length;
        int result=0;
        for(int i=0;i<n;i++){
            int count=0;
            while(nums[i]!=0){
                nums[i]=nums[i]/10;
                count++;
            }
            if(count%2==0){
                result++;
            }
        }
        return result;
    }
}
