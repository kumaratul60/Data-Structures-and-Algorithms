package Arrays;

import java.util.Scanner;

public class Kadens_MaxSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int subA;
			subA = maxSubArray1(a, n);
			System.out.println(subA);
		}
	}

	static int maxSubArray(int a[], int n) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (sum < 0) {
				sum = 0;
			}

			maxSum = Math.max(maxSum, sum);

		}
		return maxSum;
	}

	static int maxSubArray1(int a[], int n) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (sum < 0) {
				sum = 0;
			}

			if (sum > maxSum)
				maxSum = sum;

		}
		return maxSum;
	}

}
