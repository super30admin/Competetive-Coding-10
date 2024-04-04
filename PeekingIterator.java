package week10.mock;

import java.util.Iterator;

public // Java Iterator interface reference:
//https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
 Iterator<Integer> iterator;
 int current;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator = iterator;
     if(iterator.hasNext())
         current = iterator.next();  //curr = 1, next =2
	}
	
 // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
     return current;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
     int old = current;
	    if(iterator.hasNext())
         current = iterator.next();
     else
         current =0;
     return old;
	}
	
	@Override
	public boolean hasNext() {
	    return current!=0;
	}
}