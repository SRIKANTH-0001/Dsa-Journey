import java.util.HashSet;
import java.util.Set;

public class Day_37_JewelsStones {
    public static void main(String[] args) {
       String jewels="aA";
       String stones="aAAbbb";

        Set<Character> set=new HashSet<>();

        for (char ch : jewels.toCharArray()) {
            set.add(ch);
        }
        int count=0;

        for (char ch : stones.toCharArray()) {
            if(set.contains(ch)){
                count++;
            }
        }
        System.out.println(count);
    }
}
