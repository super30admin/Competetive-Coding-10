// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    int peekedElement;
    boolean havePeeked;
    Iterator<Integer> iterator;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iterator = iterator;
        this.havePeeked = false;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(!havePeeked) {
            peekedElement = iterator.next();
            havePeeked = true;
        }
        
        return peekedElement;
        
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(!havePeeked) {
            return iterator.next();
        }
        Integer value = peekedElement;
        havePeeked = false;
        return value;

	}
	
	@Override
	public boolean hasNext() {
	    return havePeeked || iterator.hasNext();
	}
}