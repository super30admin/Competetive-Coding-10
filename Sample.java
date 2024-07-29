//Problem 1 Best Time to Buy and Sell Stock II
// TC O(n)
// SC O(1)
class Solution {
    public int maxProfit(int[] prices) {
      if(prices==null || prices.length==0) return 0;
      int result=0;
      for(int i=0;i<prices.length-1;i++)
      {
        if(prices[i]<prices[i+1])
        {
            result=result+(prices[i+1]-prices[i]);
        }
      } 
      return result; 
    }
}
//Problem 2 Peeking Iterator
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    ArrayList<Integer> list = new ArrayList<>();
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        while(iterator.hasNext())
        {
            int num=iterator.next();
            list.add(num);
        }
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        int num=list.get(0);
        return num;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int num=list.get(0);
        list.remove(0);
        return num;
	}
	
	@Override
	public boolean hasNext() {
	    return list.size()>0? true:false;
	}
}