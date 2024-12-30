function maxProfitII(prices: number[]): number {
  let profit = 0;
  for (let i = 0; i < prices.length; i++) {
    if (prices[i] > prices[i - 1]) {
      profit += prices[i] - prices[i - 1];
    }
  }
  return profit;
}

function maxProfit(prices: number[]): number {
  let min = Number.MAX_SAFE_INTEGER;
  let max = Number.MIN_SAFE_INTEGER;
  let profit = 0;
  for (let i = 0; i < prices.length; i++) {
    if (prices[i] < min) {
      profit = Math.max(profit, max - min);
      min = prices[i];
      max = prices[i];
    } else {
      max = Math.max(max, prices[i]);
    }
  }
  profit = Math.max(profit, max - min);
  return profit;
}

function maxProfit_with_pointer(prices: number[]): number {
  let profit = 0;

  let left = 0;
  for (let right = 1; right < prices.length; right++) {
    if (prices[right] > prices[left]) {
      profit = Math.max(profit, prices[right] - prices[left]);
    } else {
      left = right;
    }
  }

  return profit;
}

describe("122. Best Time to Buy and Sell Stock II", () => {
  it("Happy Path - 01", () => {
    expect(maxProfitII([7, 1, 5, 3, 6, 4])).toStrictEqual(7);
  });
});

describe("121. Best Time to Buy and Sell Stock", () => {
  it("Happy Path - 01", () => {
    expect(maxProfit([7, 1, 5, 3, 6, 4])).toStrictEqual(5);
  });

  it("Happy Path - 02", () => {
    expect(maxProfit([2, 4, 1])).toStrictEqual(2);
  });

  it("Happy Path - 01 - with pointer", () => {
    expect(maxProfit_with_pointer([7, 1, 5, 3, 6, 4])).toStrictEqual(5);
  });

  it("Happy Path - 02 - with pointer", () => {
    expect(maxProfit_with_pointer([2, 4, 1])).toStrictEqual(2);
  });
});
