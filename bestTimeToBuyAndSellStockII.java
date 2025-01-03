// Time Complexity = O(n)
// Space Complexity = O(1)

class Solution {
  public int maxProfit(int[] prices) {
    int totalProfit = 0;

    // Iterate through the prices array
    for (int i = 1; i < prices.length; i++) {
      // If there's a profit to be made by selling at i, add it
      if (prices[i] > prices[i - 1]) {
        totalProfit += prices[i] - prices[i - 1];
      }
    }

    return totalProfit;
  }
}