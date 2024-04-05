// TC: O(1)

// Approach: Storing the value of the internal iterator and moving 
// it to next whenever next() of external iterator is called.

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    boolean hasNext;
    Integer next;
    Iterator<Integer> iterator;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        if (iterator.hasNext()) {
            this.hasNext = iterator.hasNext();
            this.next = iterator.next();
        }

        this.iterator = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        int nextVal = next;

        if (iterator.hasNext()) {
            hasNext = true;
            next = iterator.next();
        } else {
            hasNext = false;
            next = null;
        }

        return nextVal;
    }

    @Override
    public boolean hasNext() {
        return hasNext;
    }
}