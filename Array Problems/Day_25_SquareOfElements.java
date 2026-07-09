/*
    Problem:SquareofElements
    Input: [-4,-1,0,3,10]
    output: [0,1,9,16,100]
*/
import java.util.Arrays;

public class Day_25_SquareOfElements {
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        int[] result=squareOfEle(nums);   
        System.out.println(Arrays.toString(result));
    }

    public static int[] squareOfEle(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;
        int[] res=new int[nums.length];

        while (left<=right) {
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                res[index]=nums[left]*nums[left];
                left++;
            }else{
                res[index]=nums[right]*nums[right];
                right--;
            }
            index--;
        }
        return res;
    }
}
