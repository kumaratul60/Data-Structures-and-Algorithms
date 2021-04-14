package Searching;

import java.util.Scanner;

public class BitonicArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			int index = peak(a);
			int ans = searchBitonic(a, x, index);
			System.out.println(ans);

		}

	}

// Function for binary search in ascending part
	static int binaryAsc(int a[], int low, int high, int x) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == 0)
				return mid;
			else if (a[mid] > x)
				return binaryAsc(a, low, mid - 1, x);
			else
				return binaryAsc(a, mid + 1, high, x);
		}
		return -1;
	}

	//// Function for binary search in descending part of array
	static int binaryDsc(int a[], int low, int high, int x) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == 0)
				return mid;
			else if (a[mid] > x)
				return binaryAsc(a, mid + 1, high, x);
			else
				return binaryAsc(a, low, mid - 1, x);
		}
		return -1;
	}

	// finding bitonic point
	static int peak(int a[]) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (mid > 0 && mid > a.length - 1) {
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

	// Function to search key in bitonic array
	static int searchBitonic(int arr[], int key, int index) {
		if (key > arr[index]) {
			return -1;
		} else if (key == arr[index]) {
			return index;
		} else {
			int temp = binaryAsc(arr, 0, index - 1, key);
			if (temp != -1) {
				return temp;
			}

			// Search in right of k
			return binaryDsc(arr, index + 1, arr.length - 1, key);
		}
	}

}
