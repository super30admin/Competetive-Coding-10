//TC - O(N);
//SC - O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0; // Initialize the total profit to 0

        // Iterate over the price array starting from the second element
        for (int i = 1; i < prices.length; i++) {
            // If the price at the current day is greater than the previous day's price
            if (prices[i] - prices[i - 1] > 0) {
                // Add the difference to the total profit
                profit += prices[i] - prices[i - 1];
            }
        }

        // Return the total accumulated profit
        return profit;
    }
}
