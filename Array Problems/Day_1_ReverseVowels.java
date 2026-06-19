// Problem No:

//Given String:s

// Sample Input: "Leetcode"
// Sample Output: "Loetcede"

class Day_1_ReverseVowels{
    public static void main(String[] args) {
        String s="Leetcode";
        String result=reverseVowels(s);
        System.out.println(result);
    }

    public static String reverseVowels(String s){
        char ch[]=s.toCharArray();
        int n=s.length();
        int start=0;
        int end=n-1;

        while(start<end){
            if(!isVowel(ch[start])){
                start++;
            }else if(!isVowel(ch[end])){
                end--;
            }else{
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }

    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }else{
            return false;
        }
    }
}