public class Day_35_LengthOfLastWord {
    public static void main(String[] args) {
        String s="what's you name?";
        String str=s.trim();
        int n=str.length();
        int count=0;
        for (int i = n-1; i >=0; i--) {
            if(str.charAt(i)!=' '){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
