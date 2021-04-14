package SlidingWindow;

import java.util.Scanner;

public class Max_SubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int k = sc.nextInt();
			int max = maxSubArray1(a, n, k);
			System.out.println(max);
		}
	}

	static int maxSubArray(int a[], int n, int k) {
		int i = 0, j = 0, sum = 0;
		// int max = Integer.MIN_VALUE;
		int max = -1;

		if (n < k)
			return -1;

		while (j < n) {
			for (; j < n; j++) {
				sum += a[j];

				if (j - i + 1 < k)
					j++;
				else if (j - i + 1 == k) {
					sum = Math.max(max, sum);
					sum -= a[i];
					i++;
					j++;
				}
			}
		}

		return sum;
	}

	static int maxSubArray1(int a[], int n, int k) {
		if (n < k)
			return -1;
		int sum = 0;
		for (int i = 0; i < k; i++)
			sum += a[i];
	

		int res = sum;
		for (int i = k; i < n; i++) {
			res += a[i] - a[i - k];
			sum = Math.max(res, sum);
		}
		return sum;
	}

}
