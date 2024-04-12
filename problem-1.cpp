class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit = 0, prev = prices[0];
        for(int i = 0; i < prices.size() -1; i++){
            if(prices[i] > prices[i + 1]){
                profit += prices[i] - prev;
                prev = prices[i+1];
            }
        }
        profit = profit + (prices[prices.size()-1] - prev);
        return profit;
    }
};
