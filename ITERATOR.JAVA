//TC - O(1)
//SC - O(1)

class PeekingIterator implements Iterator<Integer> {
    Integer peek; // Variable to store the next element that has been peeked
    Iterator<Integer> it; // The original iterator

    // Constructor to initialize the iterator and the peek variable
	public PeekingIterator(Iterator<Integer> iterator) {
	    this.it = iterator; // Assign the provided iterator to the class variable
        this.peek = null; // Initialize peek to null as no element has been peeked yet
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if (peek == null) { // Check if there is no peeked element already stored
            if (!it.hasNext()) return -1; // If the iterator has no more elements, return -1
            peek = it.next(); // Otherwise, get the next element and store it in peek
        }
        return peek; // Return the peeked element
	}
	
	// Returns the next element in the iteration and advances the iterator.
	@Override
	public Integer next() {
	    if (peek != null) { // If there is a peeked element
            Integer toReturn = peek; // Store the peeked element in a temporary variable
            peek = null; // Reset peek to null as it is now consumed
            return toReturn; // Return the previously peeked element
        }
        if (!it.hasNext()) return -1; // If there are no more elements, return -1
        else {
            return it.next(); // Otherwise, return the next element from the iterator
        }
	}
	
	// Returns true if the iteration has more elements.
	@Override
	public boolean hasNext() {
	    return peek != null || it.hasNext(); // True if there's a peeked element or more elements in the iterator
	}
}
