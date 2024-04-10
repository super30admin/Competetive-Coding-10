'''
TC: O(n) - Go through all the prices
SC: O(1) - Just working with few pointers
'''
from typing import List

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        buy = float('inf')
        for i, price in enumerate(prices):
            if price < buy:
                buy = price
            else:
                profit += (price - buy)
                buy = price
        return profit
s = Solution()
print(s.maxProfit([7,1,5,3,6,4]))
print(s.maxProfit([1,2,3,4,5]))
print(s.maxProfit([7,6,4,3,1]))