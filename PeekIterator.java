// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
// Time : O(1) // All methods: O(1)
// Space : O(1)

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> itr=null;
    private Integer curr=null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here. Iterator = [1,2,3]
        this.itr = iterator;
        next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return curr;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
       Integer returnVal = curr;
       curr=null;
	   if(itr!=null && itr.hasNext()){
        curr=itr.next();
       }
       return returnVal;
	}
	
	@Override
	public boolean hasNext() {
	    return curr!=null;
	}
}