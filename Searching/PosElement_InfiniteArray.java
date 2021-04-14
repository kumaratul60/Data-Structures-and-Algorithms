package Searching;

import java.util.Scanner;

public class PosElement_InfiniteArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int index = find(a, x);
			System.out.println(index);

		}
	}

	static int binarySearch(int a[], int low, int high, int x) {

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == x)
				return mid;
			else if (a[mid] > x)
				return binarySearch(a, low, mid - 1, x);
			return binarySearch(a, mid + 1, high, x);
		}
		return -1;
	}

	static int find(int a[], int x) {

		int low = 0;
		int high = 1;

		while (a[high] < x) {
			low = high;
			high *= 2;
		}

		return binarySearch(a, low, high, x);

	}

}
