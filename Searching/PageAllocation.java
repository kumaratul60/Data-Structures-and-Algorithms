package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class PageAllocation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int total = binarySearch(a, n, k);
			System.out.println(total);
		}

	}

	static boolean isValid(int[] a, int n, int k, int max) {
		int student = 1;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (sum > max) {
				student++;
				sum = a[i];
			}
			if (student > k)
				return false;
		}

		return true;
	}

	static int binarySearch(int a[], int n, int k) {

		// k = no. of student
		// n = no. of books

		if (n < k)
			return -1;

		long sum = 0;
		for (int i = 0; i < n; i++)
			sum += a[i];
		int low = 0;
		int high = (int) sum;
		int res = Integer.MAX_VALUE;
		// int res =0;

		while (low <= high) {
			int mid = low + (high - low) / 2;

//			if (isValid(a, n, k, mid) == true) { 

			if (isValid(a, n, k, mid)) {

				res = Math.min(res, mid);
				high = mid - 1;
			} else
				low = mid + 1;
		}
		return res;

	}

}
