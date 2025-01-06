# The maxProfit method calculates the maximum profit from multiple transactions in a stock price list.

# Iterate through the price list:
# - Add the profit of every positive price difference between consecutive days.

# Return the accumulated profit.

# TC: O(n) - Single traversal of the price list.
# SC: O(1) - Constant space usage.


from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        for i in range(1, len(prices)):
            profit += (prices[i] - prices[i - 1])

        return profit