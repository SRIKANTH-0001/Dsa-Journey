import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day_44_Twosum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result=twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }   
    public static int[] twoSum(int[] nums,int target){
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            if (numMap.containsKey(c)) {
                return new int[] { numMap.get(c), i };
            }
            numMap.put(nums[i], i);
        }
        return new int[0];
    }
}
