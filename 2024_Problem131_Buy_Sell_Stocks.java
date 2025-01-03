//122. Best Time to Buy and Sell Stock 2 - https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int left = 0; //buy
        int right = 1; //sell
        int maxProfit = 0;

        while(right < n){
            if(prices[left] < prices[right]){
                maxProfit += prices[right] - prices[left];
                left++;
            } else {
                left = right;
            }
            right++;
        }

        return maxProfit;
    }
}

