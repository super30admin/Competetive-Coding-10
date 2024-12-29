// Approach : Instead of Exhaustive . Take the Greedy Approach.
// Time: O(n)
// Space : O(1)
class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length ==0) return 0;
        int maxProfit =0;
        int n = prices.length;
        for(int i =1;i<n;i++){
            if(prices[i]>prices[i-1]){
                maxProfit+=prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }
}