# Time Complexity : O(n), where n is the length of the array
# Space Complexity : O(1)
class Solution:
    def maxProfit(self, prices):
        if not prices:
            return 0

        min_price = float('inf')
        max_profit = 0

        for price in prices:
            if price < min_price:
                min_price = price
            elif price - min_price > max_profit:
                max_profit = price - min_price

        return max_profit

# Examples to test the function
sol = Solution()

# Example 1
prices1 = [7, 1, 5, 3, 6, 4]
print("Max profit for prices1:", sol.maxProfit(prices1))  # Output: 5

# Example 2
prices2 = [7, 6, 4, 3, 1]
print("Max profit for prices2:", sol.maxProfit(prices2))  # Output: 0

# Example 3
prices3 = [2, 4, 1]
print("Max profit for prices3:", sol.maxProfit(prices3))  # Output: 2