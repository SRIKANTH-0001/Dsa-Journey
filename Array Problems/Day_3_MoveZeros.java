// Problem No:283

// Input: nums=[0,1,0,3,12]  Output:[1,3,12,0,0]
import java.util.Arrays;

public class Day_3_MoveZeros {
    public static void main(String[] args){
        int[] nums={0,1,0,3,12};
        int[] res = moveZeros(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] moveZeros(int[] nums){

        int count=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }
        while(count<n){
            nums[count++]=0;        
        }

        return nums;
    }
}
