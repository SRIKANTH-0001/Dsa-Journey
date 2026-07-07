/*
    Problem no: 1200 and Name is Minimum absolute difference 

    Input:  arr={4,2,1,3}

*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day_23_MinAbsDiff {
    public static void main(String[] args) {
        int[] arr={4,2,1,3};
        List<List<Integer>> res=minAbsDiff(arr);
        System.out.println(res);
    }     

    public static List<List<Integer>> minAbsDiff(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> res =new ArrayList<>();
        int min_diff=Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
           min_diff=Math.min(arr[i]-arr[i-1],min_diff);
        }

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-arr[i-1]==min_diff){
                List<Integer> list=new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                res.add(list);
            }
        }
        return res;
    }
}
