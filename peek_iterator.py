class PeekingIterator:
    def __init__(self, iterator):
        """
        Initialize your data structure here.
        :type iterator: Iterator
        """
        self._it = iterator
        self.peek_val = None

    def peek(self):
        """
        Returns the next element in the iteration without advancing the iterator.
        :rtype: int
        """
        # If there's not already a peeked value, get one out and store
        # it in the _peeked_value variable. We aren't told what to do if
        # the iterator is actually empty -- here I have thrown an exception
        # but in an interview you should definitely ask! This is the kind of
        # thing they expect you to ask about.
        if not self.peek_val:
            if not self._it.hasNext:
                raise StopIteration()
            self.peek_val = self._it.next()
        return self.peek_val
        

    def next(self):
        """
        :rtype: int
        """

        if self.peek_val:
            temp = self.peek_val 
            self.peek_val = None
            return temp 
        
        if not self._it.hasNext():
            raise StopIteration()
        
        return self._it.next()

    def hasNext(self):
        """
        :rtype: bool
        """
        # some point self.peek_val can be None
        return True if self.peek_val or self._it.hasNext() else False

