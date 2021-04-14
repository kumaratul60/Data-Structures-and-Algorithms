package Recursion_ADV;

public class Knapsack_01_problem {

	public static void main(String[] args) {
		int wt[] = { 10, 20, 30 };
		int value[] = { 100, 50, 150 };
		int W = 50;
		System.out.println(knapsack(value, wt, 3, W));

	}

	static int knapsack(int value[], int wt[], int n, int W) {
		if (n == 0 || W == 0)
			return 0;
		if (wt[n - 1] > W)
			return knapsack(value, wt, n - 1, W);

		// knapsack(value,wt,n-1,W-wt[n-1])+value[n-1] --> nth term included
		// knapsack(value,wt,n-1,W) --> nth term excluded

		return Math.max(knapsack(value, wt, n - 1, W - wt[n - 1]) + value[n - 1], knapsack(value, wt, n - 1, W));
	}

}
