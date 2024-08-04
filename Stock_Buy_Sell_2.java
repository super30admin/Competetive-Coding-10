// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }

        int totalProfit = 0;  
        for(int i =0; i<prices.length-1; i++){
            if(prices[i+1] > prices[i]){
                totalProfit = totalProfit + (prices[i+1] - prices[i]);
            }
        }
        return totalProfit;
    }
}