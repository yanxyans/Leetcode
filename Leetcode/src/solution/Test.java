package solution;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		MaxProfitTwo maxProfitTwo = new MaxProfitTwo();
		int[] prices = new int[] {1,2};
		int profit = maxProfitTwo.maxProfit(prices);
		System.out.println(profit);
	}

}
