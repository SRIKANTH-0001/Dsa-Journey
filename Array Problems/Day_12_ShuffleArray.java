import java.util.Arrays;

public class Day_12_ShuffleArray {
    public static void main(String[] args) {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        int[] result=shuffle(nums,n);
        System.out.println(Arrays.toString(result));
    }

    public static int[] shuffle(int[] nums,int n){
        int counter=0;
        int[] res=new int[2*n];
        for(int i=0;i<n;i++){
            res[counter]=nums[i];
            res[counter+1]=nums[n+i];
            counter+=2;
        }
        return res;
    }
}
