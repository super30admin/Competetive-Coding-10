package week10.mock;

public class BuyandSell2 {
	public int maxProfit(int[] prices) {
		int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // If the current price is higher than the previous one, we can make a profit
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
}
	public static void main(String[] args) {
		int[] arr = {2,1,2,0,1};
		BuyandSell2 b = new BuyandSell2();
		System.out.println(b.maxProfit(arr));

	}

}
