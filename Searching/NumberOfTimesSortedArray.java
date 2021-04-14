package Searching;

import java.util.Scanner;

public class NumberOfTimesSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int min = minElement(a, n);
			System.out.println(min);
		}

	}

	static int minElement(int a[], int n) {
		int low = 0;
		int high = n - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			int next = (mid + 1) % n;
			int prev = (mid + n - 1) % n;

			if (a[mid] <= a[next] && a[mid] <= a[prev])
				return mid;
			if (a[low] <= a[mid])
				low = mid + 1;
			// else if (a[mid] <= a[high])
			else
				high = mid - 1;
		}
		return -1;
	}

}
