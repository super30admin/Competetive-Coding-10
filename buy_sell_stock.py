class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profits = 0

        for i in range(1, len(prices)):
            if prices[i] > prices[i - 1]:
                profits += prices[i] - prices[i - 1]
        return profits


# time complexity is O(n)
# space complexity is O(n)
