package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class PageAllocation1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			
			int total = binarySearch1(a, n, k);
			System.out.println(total);
			
//			new PageAllocation1();
//			System.out.println(PageAllocation1.binarySearch1(a, n, k));

		}

	}

	static boolean isValid(int[] a, int n, int k, int max) {
		int student = 1;
		int page_sum = 0;
		for (int i = 0; i < n; i++) {
			page_sum += a[i];
			if (page_sum > max) {
				student++;
				page_sum = a[i];
			}
			if (student > k)
				return false;
		}
		return true;
	}

	static int binarySearch1(int a[], int n, int k) {

		// k = no. of student
		// n = no. of books

		if (n < k)
			return -1;

		int low = 0, high = 0, sum = 0;

		for (int i = 0; i < n; i++) {
			low = Math.max(low, a[i]);
			sum += a[i];

		}
		high = sum;
		//int res = 0;
		int res = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			 if (isValid(a, n, k, mid) == true) {
			//if (isValid(a, n, k, mid)) {
				res = mid;
				high = mid - 1;
			} else
				low = mid + 1;
		}
		return res;

	}

}
