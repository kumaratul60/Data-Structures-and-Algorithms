package Searching;

import java.util.Scanner;

public class MinimumNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			// int x = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			// long element = minNumber1(a, 0, n);
			// int element = minNumber(a,0,n);
			long element = minNumber2(a, 0, n - 1);
			System.out.println(element);
		}

	}

	static int minNumber(int arr[], int low, int high) {
		if (arr[high] > arr[low])
			return arr[low];
		while (arr[low] > arr[high]) {
			high--;
		}
		return arr[high + 1];
	}

	static long minNumber1(int a[], long low, long high) {

		// This condition is needed to handle the case when array
		// is not rotated at all
		if (high < low)
			return a[0];

		// If there is only one element left
		if (high == low)
			return a[(int) low];

		// Find mid
		long mid = low + (high - low) / 2; /* (low + high)/2; */

		// Check if element (mid+1) is minimum element. Consider
		// the cases like {3, 4, 5, 1, 2}
		if (mid < high && a[(int) (mid + 1)] < a[(int) mid])
			return a[(int) (mid + 1)];

		// Check if mid itself is minimum element
		if (mid > low && a[(int) mid] < a[(int) (mid - 1)])
			return a[(int) mid];

		// Decide whether we need to go to left half or right half
		if (a[(int) high] > a[(int) mid])
			return minNumber1(a, low, mid - 1);
		return minNumber1(a, mid + 1, high);
	}

	public static long findMin(int arr[], int low, int high) {
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == arr[high])
				high--;

			else if (arr[mid] > arr[high])
				low = mid + 1;
			else
				high = mid;
		}
		return arr[high];
	}

	static long minNumber2(int arr[], long low, long high) {
		while (low < high) {
			long mid = low + (high - low) / 2;
			if (arr[(int) mid] == arr[(int) high])
				high--;

			else if (arr[(int) mid] > arr[(int) high])
				low = mid + 1;
			else
				high = mid;
		}
		return arr[(int) high];
	}

}
