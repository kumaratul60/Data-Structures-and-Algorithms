package Searching;

import java.util.Scanner;

public class AlmostSorted {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();

			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int index = searchElement_AlmostSortedArray(a, n, x);
			System.out.println(index);
		}

	}

	static int searchElement_AlmostSortedArray(int a[], int n, int x) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == x)
				return mid;
			if (mid > low && a[mid - 1] == x)
				return mid - 1;
			if (mid < high && a[mid + 1] == x)
				return mid + 1;
			if (a[mid] > x)
				// return searchElement_AlmostSortedArray(a,low,mid-2);
				return mid - 2;
			else
				return mid + 2;
		}
		return -1;
	}

}
