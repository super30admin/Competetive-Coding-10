// Time Complexity = O(1)
// Space Complexity = O(1)

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {

  Iterator<Integer> iterator;
  Integer nextElement;

  public PeekingIterator(Iterator<Integer> iterator) {
    // initialize any member here.
    this.iterator = iterator;
    if(iterator.hasNext()) {
      nextElement = iterator.next();
    } else {
      nextElement = null;
    }

  }

  // Returns the next element in the iteration without advancing the iterator.
  public Integer peek() {
    return nextElement;
  }

  // hasNext() and next() should behave the same as in the Iterator interface.
  // Override them if needed.
  @Override
  public Integer next() {
    Integer current = nextElement;
    if(iterator.hasNext()) {
      nextElement = iterator.next();
    } else {
      nextElement = null;
    }
    return current;
  }

  @Override
  public boolean hasNext() {
    return nextElement != null;
  }
}