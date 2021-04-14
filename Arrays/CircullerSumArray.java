package Arrays;

import java.util.Scanner;

public class CircullerSumArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int subA;
			subA = circullerSum(a, n);
			System.out.println(subA);

		}
	}

	static int circullerSum(int a[], int n) {

		int wrapSum;
		int nonWrapSum;
		nonWrapSum = kaden(a, n);
		int totalSum = 0;
		for (int i = 0; i < n; i++) {
			totalSum += a[i];
			a[i] = -a[i];
		}
		wrapSum = totalSum - (-(kaden(a, n)));
		// non contributing element = (-(kaden(a,n)))
		// System.out.println(Math.max(wrapSum, nonWrapSum));

		return (wrapSum > nonWrapSum) ? wrapSum : nonWrapSum;
	}

	static int kaden(int a[], int n) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (sum < 0)
				sum = 0;
		}
		maxSum = Math.max(maxSum, sum);
		return maxSum;
	}

}
