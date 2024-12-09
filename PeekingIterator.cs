// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no



//https://leetcode.com/problems/peeking-iterator/

// C# IEnumerator interface reference:
// https://docs.microsoft.com/en-us/dotnet/api/system.collections.ienumerator?view=netframework-4.8

class PeekingIterator {
     // The underlying iterator for the collection.
    private IEnumerator<int> iterator;
    // Flag indicating if the iterator has more elements.
    private bool hasNext;
    // The next element in the iterator (prefetched).
    private int nextElement;

    // Constructor: Initializes the PeekingIterator with an IEnumerator.
    // iterators refers to the first element of the array.
    public PeekingIterator(IEnumerator<int> iterator) {
        // initialize any member here.
        this.iterator = iterator; // Store the provided iterator.
        // Prefetch the first element if available.
        this.hasNext = true;
        this.nextElement = iterator.Current; // Store the first element.
        
        
    }
    
    // Returns the next element in the iteration without advancing the iterator.
    public int Peek() {
        return nextElement; // Return the prefetched element.
        Console.WriteLine($"Peek: nextElement = {nextElement}");
    }
    
    // Returns the next element in the iteration and advances the iterator.
    public int Next() {
         int result = nextElement; // Store the current element to return it.
        // Advance the iterator and prefetch the next element.
        hasNext = iterator.MoveNext();
        if (hasNext) {
            nextElement = iterator.Current; // Update the next element.
        }
        return result; // Return the previously stored element.
    }
    
    // Returns false if the iterator is refering to the end of the array of true otherwise.
    public bool HasNext() {
		return hasNext; // Return the flag indicating availability of more elements.
    }
}