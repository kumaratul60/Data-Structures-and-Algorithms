package Searching;

import java.util.Scanner;

public class Indx_FirstOcc {
	public static void main(String[] ss) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			// System.out.println(new Indx_FirstOcc().firstOcc(a, x));

			System.out.println(new Indx_FirstOcc().firstOcc(a, 0, n, x));

		}

	}

//	static int firstOcc(int a[], int x) {
//		int low = 0;
//		int high = a.length - 1;
//		while (low <= high) {
//			int mid = low + (high - low) / 2;
//			// int mid = (high - low) / 2;
//			if (a[mid] == x)
//				return mid;
//			else if (a[mid] > x)
//				high = mid - 1;
//			else
//				low = mid + 1;
//		}
//		return -1;
//
//	}

	static int firstOcc(int a[], int low, int high, int x) {
		low = 0;
		high = a.length - 1;
		if (low > high)
			return -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// int mid = (high - low) / 2;

			if (a[mid] > x)
				return firstOcc(a, low, mid - 1, x);
			else if (a[mid] < x)
				return firstOcc(a, mid + 1, high, x);
			else {
				if (mid == 0 || a[mid - 1] != a[mid])
					return mid;
				else
					return firstOcc(a, low, mid - 1, x);
			}

		}
		return -1;
	}

}
