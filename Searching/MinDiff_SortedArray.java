package Searching;

import java.util.Scanner;

public class MinDiff_SortedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			 int index = minDiff(a, x);
			//int index = binarySearch(a, x);
			System.out.println(index);
		}
	}

	static int binarySearch(int a[], int x) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == x)
				return mid;
			else if (a[mid] > x)
				high = mid - 1;
			else
				low = mid + 1;
		}
		int left = Math.abs(a[low] - x);
		int right = Math.abs(a[high] - x);
		int min = Math.min(left, right);
		return min;
	}

	static int minDiff(int a[], int x) {
		int left = floor(a, x);
		int right = ceil(a, x);
		int res = Math.min(left, right);
		return res;
	}

	static int floor(int a[], int x) {
		int low = 0;
		int high = a.length - 1;
		int res = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == x) {
				return mid;
			} else if (a[mid] > x) {
				high = mid - 1;
			} else {
				res = a[mid];
				low = mid + 1;
			}
		}
		return res;
	}

	static int ceil(int a[], int x) {
		int low = 0;
		int high = a.length - 1;
		int res = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == x) {
				return mid;
			} else if (a[mid] > x) {
				res = a[mid];
				high = mid - 1;
			} else {
				// res = a[mid];
				low = mid + 1;
			}
		}
		return res;
	}
}
