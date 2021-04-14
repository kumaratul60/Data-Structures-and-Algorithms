package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Searching {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();

			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			// int index = searchElementInUnsortedArray(a, n, x);
			// int index = searchElementInSortedArray(a, n, x);
			// int index = searchElementInDSortedArray(a, n, x);
			int index = orderIsNotKnow(a, n, x);
			System.out.println(index);

		}
	}

	static int searchElementInUnsortedArray(int a[], int N, int X) {

		int index = N - 1;
		for (int i = 0; i < N; i++) {
			if (a[i] == X)
				// arr[i] = arr[index];
				return i;
		}

		return -1;
	}
////////////////////////////////////////////////////////////////////////////////

	// when order is not know:

	static int orderIsNotKnow(int a[], int n, int x) {
		for (int i = 0; i < n; i++) {
			if (a[i] > a[i + 1])
				return searchElementInDSortedArray(a, n, x);
			else
				return searchElementInSortedArray(a, n, x);
		}
		return -1;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////
// if array is sorted in incresing order

	static int searchElementInSortedArray(int arr[], int n, int x) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == x)
				return mid;
			else if (arr[mid] > x)
				high = mid - 1;

			else
				low = mid + 1;
		}
		return -1;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////

	// if array in sorted in decreseing order

	static int searchElementInDSortedArray(int arr[], int n, int x) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == x)
				return mid;
			else if (arr[mid] > x)

				low = mid + 1;

			else
				high = mid - 1;

		}
		return -1;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////

	static int countOnes(int a[], int n) {

		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == 0)
				return low = mid + 1;
			else {
				if (mid == 0 || a[mid - 1] == 0)
					return (n - mid);
				else
					high = mid - 1;
			}
		}
		return 0;
	}
}
