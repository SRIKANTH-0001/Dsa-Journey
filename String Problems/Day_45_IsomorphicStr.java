import java.util.HashMap;
import java.util.Map;

public class Day_45_IsomorphicStr {
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        boolean result=isomorpicStr(s,t);
        System.out.println(result);
    }

    public static boolean isomorpicStr(String s, String t) {
        Map<Character,Character> hm=new HashMap<>();
        int n=s.length();
        if(n!=t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char charS=s.charAt(i);
            char charT=t.charAt(i);
            
            if(hm.containsKey(charS)){
                if(hm.get(charS)!=charT){
                    return false;
                }
            }else{
                if(hm.containsValue(charT)){
                    return false;
                }
                hm.put(charS, charT);
            }
        }
        return true;
   }
}
