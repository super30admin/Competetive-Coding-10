// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class PeekingIterator implements Iterator<Integer> {

    Iterator<Integer> itr;
    Integer peek;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.itr = iterator;
        this.peek = null;
    }

    // Returns the next element in the iteration without advancing the iterator.
    //O(1)
    public Integer peek() {
        if(peek == null){
            peek = itr.next();
        }
        return peek;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    // O(1)
    @Override
    public Integer next() {
        if(peek != null){
            Integer val = peek;
            peek = null;
            return val;
        }
        return itr.next();
    }

    // O(1)
    @Override
    public boolean hasNext() {
        if(peek != null || itr.hasNext()){
            return true;
        }
        return false;
    }
}