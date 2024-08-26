class PeekingIterator:
    def __init__(self, iterator):
        self.iterator = iterator
        self._next = None
        self._has_peeked = False

    def peek(self):
        if not self._has_peeked:
            if self.iterator.hasNext():
                self._next = self.iterator.next()
                self._has_peeked = True
        return self._next

    def next(self):
        if not self._has_peeked:
            return self.iterator.next()
        next_element = self._next
        self._has_peeked = False
        self._next = None
        return next_element

    def hasNext(self):
        return self._has_peeked or self.iterator.hasNext()
