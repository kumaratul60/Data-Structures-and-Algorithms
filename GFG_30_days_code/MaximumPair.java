package GFG_30_days_code;

import java.util.Scanner;

public class MaximumPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			System.out.println(sum_pair(a, n));
		}

	}

	static int sum_pair(int a[], int n) {

		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				maxSum = Math.max(maxSum, a[i] + a[j]);
			}
		}

		// max pair in array
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] + a[j] == maxSum)
					count++;
			}

		}
		return count;
	}

}
