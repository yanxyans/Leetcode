package solution;

public class MaxProfitFee {
	public int maxProfit(int[] prices, int fee) {
		int n = prices.length;
		if (n < 1) {
			return 0;
		}
		int cash = 0;
		int stock = 0 - prices[0];
		
		for (int i = 1; i < n; i++) {
			cash = Math.max(cash, stock + prices[i] - fee);
			stock = Math.max(stock, cash - prices[i]);
		}
		return cash;
	}
}
