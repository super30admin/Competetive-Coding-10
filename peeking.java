// Time Complexity : exponential -> 0( 1 )
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Integer nextEl = null;
    Iterator<Integer> iter = null;
    public PeekingIterator(Iterator<Integer> iterator) {
        this.iter = iterator;
        nextEl = iter.next();
    }
    public Integer peek() {
        return nextEl;
    }
    public Integer next() {
        Integer val = nextEl;
        if (iter.hasNext()) {
            nextEl = iter.next();
        } else {
            nextEl = null;
        }
        return val;
    }
    public boolean hasNext() {
        return nextEl != null;
    }
}