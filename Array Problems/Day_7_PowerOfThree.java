public class Day_7_PowerOfThree {
    public static void main(String[] args) {
        int n=81;
        boolean result=isPowerOfthree(n);
        System.out.println(result);
    }

    public static boolean isPowerOfthree(int n){
        while(n>=3){
            if(n%3!=0){
                return false;
            }else{
                n=n/3;
            }
        }
    return true;
    }
}
