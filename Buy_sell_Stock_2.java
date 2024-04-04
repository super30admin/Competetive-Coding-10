class Solution {
    int recursiveFunction(int []prices, int index, int toBuy, int [][]dp) {
        //base
        if(index == prices.length) {
            return 0;
        }
        if(dp[index][toBuy] != -1) {
            return dp[index][toBuy];
        }


        //logic
        int profit = 0;
        if(toBuy == 1) {
            profit = Math.max(-prices[index] + recursiveFunction(prices, index+1, 0,dp), 0+recursiveFunction(prices, index+1, 1,dp));
        } else {
            profit = Math.max(prices[index] + recursiveFunction(prices, index+1, 1,dp), 0+recursiveFunction(prices, index+1, 0,dp));
        }
        dp[index][toBuy] = profit;
        return dp[index][toBuy];
    }
    public int maxProfit(int[] prices) {
        int [][]dp = new int [prices.length][2];
        for( int i =0; i< prices.length;i++) {
            Arrays.fill(dp[i], -1);
        }
        int index =0; 
        int toBuy = 1;
        return recursiveFunction(prices, index, toBuy,dp);
    }
}