// TC: O(n), sc:O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i=1;i<prices.length;i++){
            int j= i-1;
            if(prices[i]>prices[j]){
                max = prices[i]-prices[j]+max;
            }
        }
        return max;
    }
}