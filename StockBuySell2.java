// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
//Approach : Keep adding the incremental positive profits


class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0 ;

        for(int i = 1; i < prices.length ; i++){

            profit += Math.max(0, prices[i] - prices[i-1]);
        }

        return profit;
    }
}


//approach 2:
// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
//Approach : Keep adding the profits as soon as we encounter a valley

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int valley = Integer.MAX_VALUE;
        int peak = valley;

        for(int i = 0; i < prices.length ; i++){
            if( prices[i] < peak){
                profit += peak - valley;

                valley = prices[i];
                peak = valley; // new peak
            }
            else{
                peak = prices[i];
            }
        }
        profit += peak - valley; // if last is peak, we have to add it to profit

        return profit;
    }
}