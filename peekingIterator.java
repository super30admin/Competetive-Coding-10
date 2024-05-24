// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
// Tc: O(1) Sc: O(1) for all the methods
/* 
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr;
    Integer val = null;
      public PeekingIterator(Iterator<Integer> iterator) {
          // initialize any member here.
        itr = iterator;
          if(itr.hasNext()) val = itr.next();
        
      }
      
      // Returns the next element in the iteration without advancing the iterator.
      public Integer peek() {
      
      return val;
          
      }
      
      // hasNext() and next() should behave the same as in the Iterator interface.
      // Override them if needed.
      @Override
      public Integer next() {
        
        Integer ans = val;
        if(itr.hasNext()) val = itr.next();
        else val = null;
        return ans;
          
      }
      
      @Override
      public boolean hasNext() {
          return val != null || itr.hasNext();
      }
  }

  */

import java.util.*;
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

// Tc: O(1) Sc: O(1) for all the methods
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr;
    Integer peekVal = null;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        itr = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (peekVal == null) {
            if (itr.hasNext()) {
                peekVal = itr.next();
            }
        }

        return peekVal;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (peekVal != null) {
            Integer toReturn = peekVal;
            peekVal = null; // Reset peekVal since it's about to be consumed
            return toReturn;
        }

        return itr.next();
    }

    @Override
    public boolean hasNext() {
        return peekVal != null || itr.hasNext();
    }
}