# The PeekingIterator class extends an iterator to allow peeking at the next element without advancing.

# Initialization:
# - Store the given iterator and initialize `_next` to the first element.

# peek:
# - Return `_next` without advancing the iterator.

# next:
# - Return the current `_next` and update `_next` to the next element if available.

# hasNext:
# - Check if `_next` is not None to determine if there are more elements.

# TC: O(1) - Each operation (peek, next, hasNext) is constant time.
# SC: O(1) - Constant space usage.


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
        # if self.iterator.hasNext():
        #     self._next = self.iterator.next()
        # else:
        #     self._next = None
        self._next = None
        self.next()

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        return self._next

    def next(self):
        """
        :rtype: int
        """
        curr = self._next
        if self.iterator.hasNext():
            self._next = self.iterator.next()
        else:
            self._next = None
        return curr

    def hasNext(self):
        """
        :rtype: bool
        """
        return self._next is not None

# Your PeekingIterator object will be instantiated and called as such:
# iter = PeekingIterator(Iterator(nums))
# while iter.hasNext():
#     val = iter.peek()   # Get the next element but not advance the iterator.
#     iter.next()         # Should return the same value as [val].