//time complexity:O(n)
//space complexity:O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int start = prices[0];
        int len = prices.length;
        for(int i = 1;i<len; i++){
            if(start < prices[i]) 
            {
                 max += prices[i] - start;
            }
            start = prices[i];
        }
        return max;
    }
    public static void main(String[] args)
    {
        Solution s= new Solution();
        int[] prices = {7,1,5,3,6,4};
        int ans=s.maxProfit(prices);
        System.out.println(ans);
    }
}
