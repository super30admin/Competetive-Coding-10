// Problem 284. Peeking Iterator
// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer nextElement;
    private boolean hasMoreElements;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        if (iterator.hasNext()) {
            nextElement = iterator.next();
            hasMoreElements = true;
        } else {
            hasMoreElements = false;
        }
    }

    public Integer peek() {
        return nextElement;
    }

    @Override
    public Integer next() {
        Integer returnElement = nextElement;
        if (iterator.hasNext()) {
            nextElement = iterator.next();
        } else {
            hasMoreElements = false;
            nextElement = null;
        }
        return returnElement;
    }

    @Override
    public boolean hasNext() {
        return hasMoreElements;
    }
}
