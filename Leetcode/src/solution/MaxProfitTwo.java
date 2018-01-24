package solution;

public class MaxProfitTwo {
	public int maxProfit(int[] prices) {
		int profit = 0;
		int n = prices.length;
		if (n < 2) {
			return profit;
		}
		
		int dip = 0;
		int peak = -1;
		for (int i = 1; i < n; i++) {
			int price = prices[i];
			if (peak > -1) {
				if (price > prices[peak]) {
					peak = i;
				} else if (price < prices[peak]) {
					profit += prices[peak] - prices[dip];
					dip = i;
					peak = -1;
				}
			} else {
				if (price > prices[dip]) {
					peak = i;
				} else if (price < prices[dip]) {
					dip = i;
				}
			}
		}
		
		if (peak > -1) {
			profit += prices[peak] - prices[dip];
		}
		
		return profit;
	}
}
