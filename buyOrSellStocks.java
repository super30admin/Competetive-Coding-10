
class Solution {

    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int i = 0;
        int j;
        while (i + 1 < prices.length) {
            j = i + 1;
            if (prices[i] < prices[j]) {

                while (j + 1 < prices.length) {
                    if (prices[j] < prices[j + 1]) {
                        j++;
                    }//if
                    else {
                        break;
                    }
                }//while

                max_profit += prices[j] - prices[i];
                i = j + 1;

            }//if
            else {
                i++;
            }
        }//while

        return max_profit;
    }//method
}//class
