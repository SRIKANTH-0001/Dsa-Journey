public class Day_10_RichestCus {
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{4,5,6}};
        int result=richestCus(accounts);
        System.out.println(result);
    }

    public static int richestCus(int[][] accounts){
        int n=accounts.length;
        int result=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            result=Math.max(result,sum);
        }
        return result;
    }
}