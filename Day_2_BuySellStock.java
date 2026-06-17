//Problem No:121

//Input:[7,1,5,3,6,4]

//Output:5

class Day_2_BuySellStock {
    public static void main(String[] args) {
        int prices[] = {5,4,3,2,1};
        int result = solution(prices);
        System.out.println(result);
    }

    public static int solution(int[] prices) {
        int n = prices.length;
        int max_profit = 0;
        int buy_price = prices[0];

        for (int i = 1; i < n; i++) {
            int current_profit = prices[i] - buy_price;
            if (current_profit > max_profit) {
                max_profit = current_profit;
            }
            if (buy_price > prices[i]) {
                buy_price = prices[i];
            }
        }
        return max_profit;
    }
}
