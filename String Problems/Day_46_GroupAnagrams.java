import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day_46_GroupAnagrams {
    public static void main(String[] args) {
        String strs[]={"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();

        for(String str:strs){
            char chars[]=str.toCharArray();
            Arrays.sort(chars);
            String sortedString=new String(chars);
            if(map.containsKey(sortedString)==false){
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(str);
        }
        result.addAll(map.values());
        System.out.println(result); 
    }


}
