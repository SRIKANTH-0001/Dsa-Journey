// Problem No:509

// Input:n=3
// Output:2

public class Day_8_FibonacciNum {
    public static void main(String[] args) {
        int n=6;
        int result=fibonacciNum(n);
        System.out.println(result);
    }

    public static int fibonacciNum(int n){

        if(n<2){
            return n;
        }

        int a=0;
        int b=1;
        for(int i=2;i<=n;i++){
            int ans=a+b;
            a=b;
            b=ans;
        }
        return b;
    }
}