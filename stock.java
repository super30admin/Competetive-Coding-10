class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int curr=0;
        for(int i=1;i<n;i++){
            if(prices[i-1]<prices[i]){
                curr+=prices[i]-prices[i-1];
            }

        }
        return curr;
    }
}
