//time: O(n)
//space: O(1)
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        if(prices.size() == 1) return 0;
        int i = 0, j = 1;
        int result = 0;
        while(j < prices.size()) {
            if(prices[j] - prices[i] > 0) {
                result += (prices[j] - prices[i]); // 4 + 3
            }
            i++;
            j++;
        }
        return result;
    }
};