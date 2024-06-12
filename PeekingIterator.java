// Time Complexity : O(1)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
//Approach : if next element is present store it in a variable immediately in constructor and next method.

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

import java.util.NoSuchElementException;

class PeekingIterator implements Iterator<Integer> {
    private Integer next = null;
    private Iterator<Integer> iter;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iter = iterator;

	    if(iter.hasNext()){
            next = iter.next();
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        if(next == null){
            throw new NoSuchElementException();
        }

        int curr = next;
        next = null;
        if(iter.hasNext()){
            next = iter.next();
        }

        return curr;

	}
	
	@Override
	public boolean hasNext() {
	    return next != null;
	}
}