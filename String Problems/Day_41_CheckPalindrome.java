public class Day_41_CheckPalindrome {
    public static void main(String[] args) {
        String s="mama : is : si,, am am";
        boolean result=isPalindrome(s);
        System.out.println(result);
    }  

    public static boolean isPalindrome(String s){
        s=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int start=0,end=s.length()-1;

        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
