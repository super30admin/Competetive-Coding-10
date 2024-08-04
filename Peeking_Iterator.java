// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    int val;
    Boolean peaked = false;
    Iterator<Integer> it = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.it = iterator;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(it.hasNext()){
            if(peaked == false){
                val = it.next();
                peaked = true;
            }
        }
        return val;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(peaked){
            peaked = false;
            return val;
        }
        if(it.hasNext()){
            return it.next();
        }
        return null;
	}
	
	@Override
	public boolean hasNext() {
	    return peaked || it.hasNext();
	}
}