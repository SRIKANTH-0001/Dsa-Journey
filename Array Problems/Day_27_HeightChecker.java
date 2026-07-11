import java.util.Arrays;

public class Day_27_HeightChecker {
    public static void main(String[] args) {
        int[] heights={2,5,3,1,2,3,7,8};
        int result=heightChecker(heights);
        System.out.println(result);
    }

    public static int heightChecker(int[] heights){
        int count=0;
        int[] copyHeights=Arrays.copyOf(heights, heights.length);
        Arrays.sort(copyHeights);
        for(int i=0;i<heights.length;i++){
            if(copyHeights[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}
