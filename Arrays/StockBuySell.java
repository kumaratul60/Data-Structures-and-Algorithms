package Arrays;

import java.util.Scanner;

public class StockBuySell {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		new StockBuySell();
		System.out.println(stockBuySell(a,0, n));
		;
		stockBuySell(a, n);

	}

	static void stockBuySell(int price[], int n) {

		// Your code here
		int profit = 0;
		for (int i = 1; i < n; i++) {
			if (price[i] > price[i - 1])
				profit += price[i] - price[i - 1];
		}
		System.out.println(profit);

	}
/////////////////////////////////////////
	static int stockBuySell(int price[], int start, int end) {
		if (end <= start)
			return 0;
		int profit = 0;
		for (int i = start; i < end; i++) {
			for (int j = i + 1; j <end; j++) {
				if (price[j] > price[i]) {
					int curr_profit = price[j] - price[i] + stockBuySell(price, start, i - 1)
							+ stockBuySell(price, j + 1, end);
					profit = Math.max(profit, curr_profit);
				}
			}
		}
		return profit;

	}

}
