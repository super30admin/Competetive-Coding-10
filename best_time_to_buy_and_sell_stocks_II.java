public class best_time_to_buy_and_sell_stocks_II {
    //TC: O(N)
    //SC: O(1)
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        for(int curr_price = 1; curr_price < n; curr_price++){
            if(prices[curr_price] > prices[curr_price-1]){
                profit += prices[curr_price] - prices[curr_price-1];
            }
        }
        return profit;
    }
}
