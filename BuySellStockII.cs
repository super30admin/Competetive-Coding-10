// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/


public class Solution {
    public int MaxProfit(int[] prices) {

        int maxProfit = 0;

        for(int i= 1;i<prices.Length; i++){
            if(prices[i]> prices[i-1]){
                maxProfit+= prices[i] - prices[i-1];
            }
        }
         return maxProfit;
    }
}