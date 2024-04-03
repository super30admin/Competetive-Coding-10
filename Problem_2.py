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
'''
Time Complexity - O(1)
Space Complexity - O(1)
Works on Leetcode
'''
class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        # create a current variable stores that stores the nextElement, iterator will be 1 step ahead.
        self.iterator = iterator
        self.current = self.iterator.next() if self.iterator.hasNext() else None

        

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        #return value stored in current but do not move the iterator
        return self.current
        

    def next(self):
        """
        :rtype: int
        """
        # return the next element and also move iterator to next element replace the current with new value
        old = self.current
        self.current = self.iterator.next() if self.iterator.hasNext() else None
        return old

    def hasNext(self):
        """
        :rtype: bool
        """
        #return whether current is Null or not null
        return self.current != None
        

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].