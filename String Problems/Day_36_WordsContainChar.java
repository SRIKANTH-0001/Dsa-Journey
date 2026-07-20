import java.util.ArrayList;

public class Day_36_WordsContainChar {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        String[] words={"leet","code"};
        char x='e';

        for (int i = 0; i < words.length; i++) {
            if(words[i].contains(String.valueOf(x))){
                arr.add(i);
            }
        }
        System.out.println(arr);
    }
}
