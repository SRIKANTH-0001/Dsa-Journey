import java.util.Arrays;

public class Day_19_RelatSortArr {
    public static void main(String[] args) {
        int[] arr1={2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2={2,1,4,3,9,6};
        int[] result=relateSortArr(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] relateSortArr(int[] arr1,int[] arr2){
        int count[]=new int[100];
        for (int i : arr1) {
            count[i]++;//{3,2}
        }
        int i=0;
        for(int num: arr2){
            while (count[num]-->0) {
                arr1[i++]=num;
            }
        }
        for(int num=0;num<count.length;num++){
            while (count[num]-->0) {
                arr1[i++]=num;
            }
        }
        return arr1; 
    }
}
