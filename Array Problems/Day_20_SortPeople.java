//Problem No:2418

//Input:name={"Mary","John","Emma"},height={180,165,170}
//Output:{"Mary","Emma","John"}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day_20_SortPeople {
    public static void main(String[] args) {
        String[] names={"Mary","John","Emma"};
        int[] heights={180,165,170};
        String[] result=sortPeople(names, heights);
        System.out.println(Arrays.toString(result));
    }

    public static String[] sortPeople(String[] names,int[] heights){
        Map<Integer,String> map=new HashMap<>();

        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);

        String[] sortedNames=new String[names.length];

        int index=0;

        for(int i=heights.length-1;i>=0;i--){
            sortedNames[index]=map.get(heights[i]);
            index++;
        }
        return sortedNames;
    }
    
}
