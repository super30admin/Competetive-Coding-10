// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class BestTimeToBuyAndSellStock-II {
    public int maxProfit(int[] prices) {

        int n = prices.length;

        int profit = 0;

        for(int i = 1; i <= n -1; i++) { //O(n)

            int diffProfit = prices[i] - prices[i - 1];

            if(diffProfit > 0) {
                profit += diffProfit;
            }
        }
        return profit;
    }
}