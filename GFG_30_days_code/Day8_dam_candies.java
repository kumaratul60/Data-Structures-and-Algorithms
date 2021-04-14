package GFG_30_days_code;

import java.util.Scanner;

public class Day8_dam_candies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(maxCandy(a, n));
		}

	}

	static int maxCandy(int height[], int n) {
		int res = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int curr = (Math.min(height[i], height[j]) * (j - i - 1));
				res = Math.max(res, curr);
			}
		}
		return res;
	}

}
