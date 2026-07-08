
import java.lang.Integer;
public class Day_24_3rdMaxNum {
    public static void main(String[] args) {
        int[] nums={2,2,3,1};
        int result=thirdMaxVal(nums);
        System.out.println(result);
    }

    public static int thirdMaxVal(int[] nums){
        Integer first_max=null;
        Integer second_max=null;
        Integer third_max=null;

        for (Integer num : nums) {
            if(num.equals(first_max)||num.equals(second_max)||num.equals(third_max)){
                continue;
            }   
            if(first_max==null|| num>first_max){
                third_max=second_max;
                second_max=first_max;
                first_max=num;
            }else if (second_max==null||num>second_max) {
                third_max=second_max;
                second_max=num;
            }else if((third_max==null||num>third_max)){
                third_max=num;
            }
        }
        if(third_max==null){
            return first_max;
        }
        return third_max;
    }
}
