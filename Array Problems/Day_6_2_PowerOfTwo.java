// Problem No:231

// Input:n=1
// Output:true

//Attempted to solve 😊
// public class Day_6_2_PowerOfTwo {
//     public static void main(String[] args) {
//         int n=22;
//         boolean result;
//         if(n==1 || n%2=0){
//             result= true;
//         }else{
//             result=false;
//         }

//         System.out.println(result);
//     }
// }

// Method :2

public class Day_6_2_PowerOfTwo {
    public static void main(String[] args) {
        int n=22;
        boolean result=isPowerOfTwo(n);
        System.out.println(result);
    }

    public static boolean isPowerOfTwo(int n){
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }else{
                n=n/2;
            }
        }
        return true;
    }
}
