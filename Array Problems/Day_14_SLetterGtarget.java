public class Day_14_SLetterGtarget {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target='c';
        char result=SLetterGtarget(letters, target);
        System.out.println(result);
    }   
    public static char SLetterGtarget(char[] letters,char target){
        int n=letters.length;
        int start=0;
        int end=n-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(letters[mid]<=target){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return start<n?letters[start]:letters[0];
    }
}
