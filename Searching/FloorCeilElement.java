package Searching;

import java.util.Scanner;

public class FloorCeilElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();

			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
//			int floor = floor(a, x);
//			int ceil = ceil(a, x);
//			System.out.println("floor of " + x + " = " + floor);
//			System.out.println("ceil of " + x + " = " + ceil);
			int flo = findFloor(a, 0, n - 1, x);
			System.out.println(flo);
		}
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

	static int findFloor(long a[], int left, int right, long x) {

		///////////////////////
		// for multiple case handle use this
		if (left > right)
			return -1;
		if (x >= a[right])
			return right;

		////////////////////////////////////////

		int res = -1;
		while (left <= right) {
			int mid = (left + (right - left) / 2);

			if (a[mid] == x)
				return mid;
			else if (a[mid] > x)
				right = mid - 1;
			else {
				res = (int) a[mid];
				left = mid + 1;
			}
		}
		return res;
	}

}
