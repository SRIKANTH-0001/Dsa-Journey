public class Day_42_LenOfOddNum {
    public static void main(String[] args) {
        String s="2408";
        String result=lenOfOddNum(s);
        System.out.println(result);
    }

    public static String lenOfOddNum(String s){
        int len=s.length()-1;

        while (len>0) {
            int d=s.charAt(len)-'0';
            if(d%2!=0){
                return s.substring(0, len+1);
            }
            len--;
        }
        return "";
    }
}
