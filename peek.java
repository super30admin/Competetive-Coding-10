// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    int nextel;
    Iterator<Integer> it;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.it=iterator;
        nextel=Integer.MIN_VALUE;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(nextel==Integer.MIN_VALUE && it.hasNext()){
            nextel=it.next();
        }
        return nextel;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(nextel==Integer.MIN_VALUE && it.hasNext()){
            return it.next();
        }
        int temp=nextel;
        nextel=Integer.MIN_VALUE;
        return temp;
	}
	
	@Override
	public boolean hasNext() {
        return it.hasNext() || nextel!=Integer.MIN_VALUE;
	}
}
