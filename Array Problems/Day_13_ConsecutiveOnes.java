public class Day_13_ConsecutiveOnes {

    public static void main(String[] args) {
        int nums[]={1,1,0,1,1,1};
        System.out.println(consecutiveOnes(nums));
    }

    public static int consecutiveOnes(int nums[]){
        int count=0;
        int max_one=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count=count+1;
                max_one=Math.max(count,max_one);
            }else{
                count=0;
            }
        }
        return max_one;
    }
}