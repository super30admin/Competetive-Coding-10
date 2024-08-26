// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr;
    Integer val;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.itr = iterator;
        this.val = itr.hasNext() ? itr.next() : null;

    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return val;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        int temp = val;
        this.val = itr.hasNext() ? itr.next() : null;
        return temp;
    }

    @Override
    public boolean hasNext() {
        return val != null;
    }
}