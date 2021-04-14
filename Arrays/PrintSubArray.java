package Arrays;

import java.util.Scanner;

public class PrintSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int subA;
			// subA = printSubArray(a, n);
			 subA = MaxSumSubArray(a, n);
			
			System.out.println(subA);
		}
	}

	static int printSubArray(int a[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int k = i; k <= j; k++) {
					System.out.println(a[k]);
				}
			}

		}
		return 0;
	}

	// BruteForce Approch

	static int MaxSumSubArray(int a[], int n) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += a[k];
				}
				maxSum = Math.max(maxSum, sum);
			}

		}
		return maxSum;
	}

}
