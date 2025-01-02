# Explain your approach in briefly only at top of your code
# Approach:
# - Use a variable `next_element` to store the next element in the iterator.
# - The `peek` operation returns `next_element` without advancing the iterator.
# - The `next` operation retrieves the current `next_element` and updates it with the next value from the iterator if available.
# - The `hasNext` operation checks if `next_element` is not None.
# This design ensures O(1) time complexity for `peek`, `next`, and `hasNext` operations.

# Time Complexity: O(1) for `peek`, `next`, and `hasNext`.
# Space Complexity: O(1), as we use a constant amount of extra space.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

# Below is the interface for Iterator, which is already defined for you.
#
# class Iterator:
#     def __init__(self, nums):
#         """
#         Initializes an iterator object to the beginning of a list.
#         :type nums: List[int]
#         """
#
#     def hasNext(self):
#         """
#         Returns true if the iteration has more elements.
#         :rtype: bool
#         """
#
#     def next(self):
#         """
#         Returns the next element in the iteration.
#         :rtype: int
#         """

class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self.iterator = iterator
        # Preload the next element if available
        self.next_element = self.iterator.next() if self.iterator.hasNext() else None

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self.next_element  # Return the preloaded next element

    def next(self):
        """
        Returns the next element in the iteration and advances the iterator.
        :rtype: int
        """
        current = self.next_element  # Store the current element to return
        # Preload the next element from the iterator if available
        self.next_element = self.iterator.next() if self.iterator.hasNext() else None
        return current

    def hasNext(self):
        """
        Returns true if there are still elements in the iteration.
        :rtype: bool
        """
        return self.next_element is not None  # Check if next_element is available

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].
