/**
 * // This is the Iterator's API interface.
 * // You should not implement it, or speculate about its implementation
 * class Iterator {
 *      hasNext(): boolean {}
 *
 *      next(): number {}
 * }
 */

class PeekingIterator {
  cachedNext: number | null = null;
  iterator: Iterator | null = null;

  constructor(iterator: Iterator) {
    this.iterator = iterator;
    this.cachedNext = iterator.next();
  }

  peek(): number {
    return this.cachedNext || -1;
  }

  next(): number {
    let temp = this.cachedNext || -1;
    if (this.iterator.hasNext()) {
      this.cachedNext = this.iterator.next();
    } else {
      this.cachedNext = null;
    }
    return temp;
  }

  hasNext(): boolean {
    return this.cachedNext != null;
  }
}

/**
 * Your PeekingIterator object will be instantiated and called as such:
 * var obj = new PeekingIterator(iterator)
 * var param_1 = obj.peek()
 * var param_2 = obj.next()
 * var param_3 = obj.hasNext()
 */
