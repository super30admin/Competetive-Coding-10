
//time complexity:O(1)
//space complexity:O(1)
import java.util.*;

class PeekingIterator implements Iterator<Integer> {
    private Integer next = null;
    private Iterator<Integer> itr = null;

    public PeekingIterator(Iterator<Integer> iterator) {

        // initialize any member here.
        this.itr = iterator;
        next();

    }

    // Returns the next element in the iteration without advancing the iterator.

    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.

    // Override them if needed.

    @Override
    public Integer next() {
        Integer returnValue = next;
        next = null;
        if (itr != null && itr.hasNext()) {

            next = itr.next();

        }
        return returnValue;
    }

    @Override

    public boolean hasNext() {
        return next != null;

    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Iterator<Integer> iterator = list.iterator();
        PeekingIterator peekingIterator = new PeekingIterator(iterator);

        System.out.println("Next element: " + peekingIterator.next());
        System.out.println("Peek element: " + peekingIterator.peek());
        System.out.println("Next element: " + peekingIterator.next());
        System.out.println("Peek element: " + peekingIterator.peek());
        System.out.println("Next element: " + peekingIterator.next());
        System.out.println("Has next: " + peekingIterator.hasNext());
        System.out.println("Next element: " + peekingIterator.next());
        System.out.println("Has next: " + peekingIterator.hasNext());
    }
}
