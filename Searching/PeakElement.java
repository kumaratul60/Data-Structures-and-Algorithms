package Searching;

import java.util.Scanner;

public class PeakElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			// int x = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			// int index = peak(a);
			// int index = binaryBitonicSearch(a);
			int index = peakElement2(a, n);
			System.out.println(index);
		}

	}

	static int peak(int a[]) {

		int low = 0;
		int high = a.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (mid > 0 && mid < a.length - 1) {

				if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1])
					return mid;

				else if (a[mid - 1] > a[mid])
					high = mid - 1;
				else
					low = mid + 1;

			} else if (mid == 0) {
				if (a[0] > a[1])
					return 0;
				else
					return 1;

			} else if (mid == a.length - 1) {
				if (a[a.length - 1] > a[a.length - 2])
					return a.length - 1;
				else
					return a.length - 2;
			}
		}
		return -1;
	}

//	static int binaryBitonicSearch(int a[]) {
//		int low = 0;
//		int high = a.length - 1;
//		while (low <= high) {
//			int mid = low + (high - low) / 2;
//
//			if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1])
//				return mid;
//			if (a[mid] < a[mid + 1])
//				low = mid + 1;
//			else
//				high = mid - 1;
//
//		}
//		return -1;
//	}

	public static int peakElement(int[] a, int n) {
		// add code here.
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (mid > 0 && mid < n - 1) {
				if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1])
					return mid;
				else if (a[mid - 1] > a[mid])
					high = mid - 1;
				else
					low = mid + 1;
			} else if (mid == 0) {
				if (a[0] > a[1])
					return 0;
				else
					return 1;
			} else if (mid == n - 1) {
				if (a[n - 1] > a[n - 2])
					return a[n - 1];
				else
					return a[n - 2];
			}

		}
		return -1;
	}

	static int peakElement1(int arr[], int n) {
		if (arr[0] > arr[1])
			return 0;
		if (arr[n - 1] > arr[n - 2])
			return (n - 1);
		for (int i = 1; i <= n - 2; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
				return i;

		}
		return -1;
	}

	static int peakElement2(int arr[], int n) {
		int start = 0, end = n - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
				return mid;
			if (mid > 0 && arr[mid - 1] >= arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
