/*
    Problem no 1221 and 
    Problem name Split a string in Balanced Strings 
*/

public class Day_39_SplitString {
    public static void main(String[] args) {
        String s="RLRRLLRLRL";

        int result=splitString(s);

        System.out.println(result);
    }

    public static int splitString(String s) {
        int left=0,right=0,count=0;

        if(s==null || s.length()==0){
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='L'){
                left++;
            }else{
                right++;
            }
            if(left==right){
                count++;
            }
        }
        return count;
    }
}
