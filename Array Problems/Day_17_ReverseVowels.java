public class Day_17_ReverseVowels {
    public static void main(String[] args) {
        String s="IceCreAm";
        int n=s.length();
        char[] ch=s.toCharArray();
        int start=0;
        int end=n-1;

        while(start<=end){
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
        System.out.println(String.valueOf(ch));
    }

    public static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }else{
            return false;
        }
    }

}
