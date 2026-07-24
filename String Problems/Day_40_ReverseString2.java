/*
    Problem No: 541
    pName:Reverse String II
*/


public class Day_40_ReverseString2 {
    public static void main(String[] args) {
        String s="abcdefg";
        int k=2;

        String result=reverseString(s,k);
        System.out.println(result);
    }
    public static String reverseString(String s,int k){
        char[] ch=s.toCharArray();

        for (int i = 0; i < ch.length; i+=k*2) {
            int start=i,end=Math.min(i+k-1,ch.length-1);
            while (start<end) {
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;

                start++;
                end--;
            }
        }


        return new String(ch);
    }
}
