//problem No:88

//Input:nums1={1,2,3,0,0,0};m=3
//nums2={2,5,6};n=3


import java.util.Arrays;

public class Day_4_MergeArray {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3;
        int n=3;
        int k=m+n-1;
        int[] result=mergeArr(nums1,nums2,m,n,k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeArr(int[] nums1,int[] nums2,int m,int n,int k ){
        int i=m-1;
        int j=n-1;

        while (j>=0) {
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
        return nums1;
    }
}
