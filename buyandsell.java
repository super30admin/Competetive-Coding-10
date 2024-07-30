// Time Complexity : exponential -> 0( n )
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int currDay = 0;
        int prevDay = 0;
        for(int i = 1; i < prices.length; i++){
            currDay = prices[i];
            prevDay = prices[i-1];
            if(currDay > prevDay){
                profit += currDay - prevDay;
            }
        }
        return profit;
    }
}