'''
Time Complexity - O(n)
Space Complexity - O(1)

Works on leetcode
'''
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        #keep the first pointer at 1st element and 2nd pointer on 2nd element
        p1, p2, profit = 0,1,0
        while p2<len(prices):
            #if price at p2 is snall or equal to p1 move p1 to p2
            if prices[p2] <= prices[p1]:
                p1 = p2
                p2+=1
            else: #calculate the diff between value at p2 and p1,set p1 to p2 and move p2 by 1 position
                profit+=prices[p2] - prices[p1]
                p1 = p2
                p2+=1

        return profit 