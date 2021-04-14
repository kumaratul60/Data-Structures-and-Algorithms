package Arrays;

import java.util.Scanner;

public class EquilibriumPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		new EquilibriumPoint();
		System.out.println(equilibrium(a, n));
		;
	}

	// Method 1
//	static int equilibrium(int a[], int n) {
//		int i, j;
//		int leftSum, rSum;
//
//		for (i = 0; i < n; ++i) {
//			leftSum = 0;
//			for (j = 0; j < i; j++)
//				leftSum += a[j];
//			rSum = 0;
//			for (j = i + 1; j < n; j++)
//				rSum += a[j];
//
//			if (leftSum == rSum)
//				return i;
//		}
//		return -1;
//	}

	// Method 2

//	static int equilibrium(int a[], int n) {
//		int sum, lSum;
//		lSum = sum = 0;
//
//		for (int i = 0; i < n; ++i) /* Find sum of the whole array */
//			sum += a[i];
//		for (int i = 0; i < n; ++i) {
//			sum -= a[i]; // sum is now right sum for index i
//			if (lSum == sum)
//				return i;
//			lSum += a[i];
//		}
//		/* If no equilibrium index found, then return 0 */
//		return -1;
//	}
	static int equilibrium(int a[],int n) {
		for(int i=0;i<n;i++) {
			int lSum = 0;
			int rSum = 0;
			for(int j = 0;j<i;j++)
				lSum += a[j];
			for(int j =i+1;j<n;j++) 
				rSum += a[j];
			if(lSum==rSum)
				return i;
		}
		return -1;
	}

}
