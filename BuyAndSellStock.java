// TC: O(n)
// SC: O(1)

// Approach: Buy at the cheapest and sell at the highest cost possible.
// As soon as the price dips, sell the stock at the highest cost and move the 
// buy index.

class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int buyIndex = 0;
        int sellIndex = 1;
        int profit = 0;

        while (sellIndex < prices.length) {
            if (prices[sellIndex] > prices[sellIndex - 1]) {
                sellIndex++;
            } else {
                // should have sold at the previous index
                profit += prices[sellIndex - 1] - prices[buyIndex];
                buyIndex = sellIndex;
                sellIndex++;
            }
        }

        if (prices[buyIndex] < prices[sellIndex - 1]) {
            profit += prices[sellIndex - 1] - prices[buyIndex];
        }

        return profit;
    }
}