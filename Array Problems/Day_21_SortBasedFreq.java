import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * problem No:1636
 * input:  nums={1,1,2,2,2,3}
 * output:  {3,1,1,2,2,2}
 */
public class Day_21_SortBasedFreq {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,3};
        int[] result=sortBasedOnFreq(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortBasedOnFreq(int[] nums) {
        
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        List<Integer> list=new ArrayList<Integer>(map.keySet());

        Collections.sort(list,(a,b)->{
            if(map.get(a)==map.get(b)){
                return b-a;
            }else{
                return map.get(a)-map.get(b);
            }
        });

        int[] resultArray=new int[nums.length];
        int index=0;

        for(int num:list){
            for (int i = 0; i < map.get(num); i++) {
                resultArray[index]=num;
                index++;
            }
        }
        return resultArray;
    }
    
}