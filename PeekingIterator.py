# Time Complexity : O(1)
# Space Complexity : O(1)
class PeekingIterator:
    def __init__(self, iterator):
        self.iterator = iterator
        self.next_element = next(self.iterator, None)

    def peek(self):
        return self.next_element

    def next(self):
        current_element = self.next_element
        self.next_element = next(self.iterator, None)
        return current_element

    def has_next(self):
        return self.next_element is not None

# Helper function to create an iterator from a list
def create_iterator(lst):
    for item in lst:
        yield item

# Examples to test the class

# Example 1
lst1 = [1, 2, 3]
iter1 = create_iterator(lst1)
peek_iter1 = PeekingIterator(iter1)
print("Example 1")
print(peek_iter1.peek())  # Output: 1
print(peek_iter1.next())  # Output: 1
print(peek_iter1.next())  # Output: 2
print(peek_iter1.has_next())  # Output: True
print(peek_iter1.next())  # Output: 3
print(peek_iter1.has_next())  # Output: False

# Example 2
lst2 = [4, 5, 6]
iter2 = create_iterator(lst2)
peek_iter2 = PeekingIterator(iter2)
print("Example 2")
print(peek_iter2.peek())  # Output: 4
print(peek_iter2.next())  # Output: 4
print(peek_iter2.peek())  # Output: 5
print(peek_iter2.next())  # Output: 5
print(peek_iter2.has_next())  # Output: True
print(peek_iter2.next())  # Output: 6
print(peek_iter2.has_next())  # Output: False

# Example 3
lst3 = [7, 8, 9]
iter3 = create_iterator(lst3)
peek_iter3 = PeekingIterator(iter3)
print("Example 3")
print(peek_iter3.peek())  # Output: 7
print(peek_iter3.next())  # Output: 7
print(peek_iter3.peek())  # Output: 8
print(peek_iter3.next())  # Output: 8
print(peek_iter3.has_next())  # Output: True
print(peek_iter3.next())  # Output: 9
print(peek_iter3.has_next())  # Output: False