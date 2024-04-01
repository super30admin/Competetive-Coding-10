import java.util.Iterator;

public class Peeking_Iterator {
    class PeekingIterator implements Iterator<Integer> {
        //TC: O(N)
        //SC: O(1)
        private Iterator<Integer> itr = null;
        private Integer nextval = null;
        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            this.itr = iterator;
            nextval = itr.next();
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return nextval;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer val = nextval;
            if(itr.hasNext()) nextval = itr.next();
            else nextval = null;
            return val;
        }

        @Override
        public boolean hasNext() {
            return nextval != null || itr.hasNext();
        }
    }
}
