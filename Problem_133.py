# TC : O(N)
# SC : O(1)

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        n = len(prices)
        for i in range(1, n):
            if prices[i-1] < prices[i]:
                profit += prices[i] - prices[i-1]
        return profit