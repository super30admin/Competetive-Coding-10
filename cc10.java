// https://leetcode.com/problems/peeking-iterator/description/
// Time Complexity : O(1)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes


class PeekingIterator implements Iterator<Integer> {
    Integer element=null;
    Iterator<Integer> iter=null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        iter=iterator;
        element=iter.next();
	    
	}
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return element;
        
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer value=element;
        if(iter.hasNext())
        {
            element=iter.next();
        }
        else{
            element=null;
        }
        return value;
	    
	}
	
	@Override
	public boolean hasNext() {
        return (element!=null); 
	}
}




// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes


class Solution {
    public int maxProfit(int[] prices) {
        int sum=0;
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i]<prices[i+1])
            {
                sum+=prices[i+1]-prices[i];
            }
        }
        return sum; 
    }
}
