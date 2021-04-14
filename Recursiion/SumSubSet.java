package Recursiion;

import java.util.Scanner;

public class SumSubSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(sumOfSubset(a, n));
		}
	}

	 // total subsets = Math.pow(2,n-1);
	// n = size of array; n-1 coz of 0 based indexing
	     
	
	static int sumOfSubset(int[] a, int n) {
		int times = (int) Math.pow(2, n - 1);

		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum = sum + (a[i] * times);
		}

		return sum;
	}

}
