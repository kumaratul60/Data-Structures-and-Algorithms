package Arrays;

import java.util.Scanner;

public class KadenAlgo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

//		new KadenAlgo();
//		System.out.println(maxSubArray(a, n));

		int max = maxSubArray(a, n);
		System.out.println(max);
	}

	static int maxSubArray(int a[], int n) {
		int sum = 0;
		// int maxi = a[0];
		int maxi = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (sum > maxi)
				maxi = sum;
			if (sum < 0)

				sum = 0;

		}
		return maxi;

	}

	static int maxSubArray1(int a[], int n) {
		int sum[] = new int[n];
		sum[0] = a[0];
		for (int i = 1; i < n; i++) {
			sum[i] = sum[i - 1] + a[i];
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int currSum = sum[i] - sum[j] + a[i];

				if (currSum > max)
					max = currSum;
			}
		}
		return max;
	}

	static int maxSubArray2(int a[], int n) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int currSum = 0;
				for (int k = i; k <= j; k++) {
					currSum += a[k];
				}
				if (currSum > max)
					max = currSum;
			}
		}
		return max;
	}

}
