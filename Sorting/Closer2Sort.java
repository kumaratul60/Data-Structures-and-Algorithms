package Sorting;

import java.util.Scanner;

public class Closer2Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			new Closer2Sort();
			System.out.println(Closer2Sort.closer(a, n, x));
		}
	}

	static int closer(int arr[], int n, int x) {
		int low = 0, high = n - 1, mid;

		while (low < high) {
			mid = low + (high - low) / 2;

			if (arr[mid] == x) {
				return mid;
			}

			if (mid >= 0 && arr[mid - 1] == x) {
				return mid - 1;
			}

			if (mid < n && arr[mid + 1] == x) {
				return mid + 1;
			}

			if (arr[mid] > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;
	}
///////////////////////////////////////////////////////////////////////////////////

	static long closer(int a[], int n, long x) {
		// add your code here
		int low = 0;
		int high = n - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;

			if (a[mid] == (int) x)
				return mid;
			if (mid > 0 && a[mid - 1] == (int) x)
				return mid - 1;
			if (mid < n && a[mid + 1] == (int) x)
				return mid + 1;
			if (a[mid] > (int) x)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
}
