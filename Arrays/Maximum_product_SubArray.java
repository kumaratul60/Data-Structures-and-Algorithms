package Arrays;

import java.util.Scanner;

public class Maximum_product_SubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		System.out.println(maxProduct(a, n));
		System.out.println(maxSum(a, n));

		System.out.println("-----------MaxSubArray Sum using Kaden baba---------");
		System.out.println(maxSubArray(a, n));

	}

	static int maxProduct(int a[], int n) {

		int maxVal = a[0];
		int minVal = a[0];

		int maxProduct = a[0];

		for (int i = 1; i < n; i++) {

			if (a[i] < 0) {
				int temp = maxVal;
				maxVal = minVal;
				minVal = temp;
			}

			maxVal = Math.max(a[i], maxVal * a[i]);
			minVal = Math.min(a[i], minVal * a[i]);

			maxProduct = Math.max(maxProduct, maxVal);
		}
		return maxProduct;

	}

	static int maxSum(int a[], int n) {

		int maxVal = a[0];
		int minVal = a[0];

		int maxSum = a[0];

		for (int i = 1; i < n; i++) {

			if (a[i] < 0) {
				int temp = maxVal;
				maxVal = minVal;
				minVal = temp;
			}

			maxVal = Math.max(a[i], maxVal + a[i]);
			minVal = Math.min(a[i], minVal + a[i]);

			maxSum = Math.max(maxSum, maxVal);
			// maxSum = Math.min(maxSum, minVal);
		}
		return maxSum;

	}
	// we can also use Kaden algo to solve maxSum problem

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

}
