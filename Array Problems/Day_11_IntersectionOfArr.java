import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day_11_IntersectionOfArr {

    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        
        int[] res=intersectionOfArr(nums1, nums2);
        System.out.println(Arrays.toString(res));

    }

    public static int[] intersectionOfArr(int[] nums1,int[] nums2){
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        set1.retainAll(set2);

        int res[]=new int[set1.size()];
        int i=0;
        for (int index : set1) {
            res[i++]=index;
        }
        return res;
    }


}