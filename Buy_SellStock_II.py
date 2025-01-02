# Explain your approach in briefly only at top of your code
# Approach:
# The goal is to maximize the profit by summing up all positive price differences between consecutive days.
# This allows capturing all potential profits without considering complex transactions or holding restrictions.

# Time Complexity: O(n), where n is the length of the prices array.
# Space Complexity: O(1), as we use only a constant amount of extra space.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        """
        Calculate the maximum profit by summing up all positive price differences.

        :param prices: List[int] - List of daily stock prices
        :return: int - Maximum profit
        """
        profit = 0  # Initialize the profit to 0
        
        # Iterate over the prices array starting from the second day
        for i in range(1, len(prices)):
            # If today's price is greater than yesterday's price, add the profit
            if prices[i] > prices[i - 1]:
                profit += prices[i] - prices[i - 1]
        
        return profit  # Return the total profit

# Example Usage
# sol = Solution()
# print(sol.maxProfit([7, 1, 5, 3, 6, 4]))  # Output: 7
# print(sol.maxProfit([1, 2, 3, 4, 5]))  # Output: 4
# print(sol.maxProfit([7, 6, 4, 3, 1]))  # Output: 0
