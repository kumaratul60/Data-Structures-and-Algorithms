package Searching;

import java.util.Scanner;

public class PeakE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			// int x = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int index = peakElement2(a, n);
			// int index = findPeak(a, n);

			System.out.println(index);
		}
	}

	public static int peakElement(int[] a, int n) {
		if (a[0] > a[1])
			return 0;

		if (a[n - 1] > a[n - 2])
			return n - 1;

		for (int i = 1; i < n - 2; i++) {
			if (a[i] > a[i - 1] && a[i] > a[i + 1])
				return i;
		}
		return -1;
	}

////////////////////////////////////////////////////////////////////////////////////////////////

	// A binary search based function
	// that returns index of a peak element

	static int findPeakUtil(int arr[], int low, int high, int n) {

		// Find index of mid
		int mid = low + (high - low) / 2; // (low + high)/2

		// Compare middle element with its neighbours (if neighbours exist)

		if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
			return mid;

		// If middle element is not peak and its left neighbor is greater than it, then
		// left half must have a peak element
		else if (mid > 0 && arr[mid - 1] > arr[mid])
			return findPeakUtil(arr, low, (mid - 1), n);

		// If middle element is not peak and its right neighbor is greater than it, then
		// right half must have a peak element
		else
			return findPeakUtil(arr, (mid + 1), high, n);
	}

	// A wrapper over recursive function findPeakUtil()
	static int findPeak(int arr[], int n) {
		return findPeakUtil(arr, 0, n - 1, n);
	}

	public static int peakElement2(int[] arr, int n) {

		int low = 0;
		int high = n - 1;
		while (low <= high) {

			int mid = low + (high - low) / 2;

			if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
				return mid;
			else {
				if (mid > 0 && arr[mid - 1] > arr[mid])
					high = mid - 1;
				else
					low = mid + 1;
			}
		}
		return -1;
	}

}
