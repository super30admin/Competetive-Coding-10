//284. Peeking Iterator - https://leetcode.com/problems/peeking-iterator/description/

class PeekingIterator implements Iterator<Integer> {

    Queue<Integer> q;
    public PeekingIterator(Iterator<Integer> iterator) {
        this.q = new LinkedList<>();
        while(iterator.hasNext()){
            //add all elements to queue
            q.add(iterator.next());
        }
    }
    //FIFO: topmost element is peeked
    public Integer peek() { //O(1)
        return q.peek();
    }

    @Override
    //remove top to access next in the queue
    public Integer next() { //O(1)
        return q.remove();
    }

    @Override
    //if current size>0, hasNext is True
    public boolean hasNext() { //O(1)
        return q.size() > 0;
    }
}