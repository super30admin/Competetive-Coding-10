//TC: O(1)
//SC: O(1)
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer nextElement;  // To store the next element in advance

	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iterator = iterator;
        if (iterator.hasNext()) {
            nextElement = iterator.next();  // Initialize with the first element
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextElement;  // Peek at the next element without moving the iterator
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer result = nextElement;
        nextElement = iterator.hasNext() ? iterator.next() : null;  // Move the iterator forward
        return result;
	}
	
	@Override
	public boolean hasNext() {
	    return nextElement != null;
	}
}
