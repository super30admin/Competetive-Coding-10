// TC=O(n)
// SC=o(1)
public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        // Traverse through the prices array
        for (int i = 1; i < prices.length; i++) {
            // If the price on the current day is higher than the previous day, accumulate the profit
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }