class Solution {


    //Tc: O(n)
    //Tc: O(1)
    public int maxProfit(int[] prices) {
        int overAllProfit = 0;

        int left = 0;

        for(int right= 1; right < prices.length; right++) {
            if(prices[right] > prices[left]) {
                overAllProfit += prices[right] - prices[left];
            }
            left++;
        }

        return overAllProfit;
    }
}