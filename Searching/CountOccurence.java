package Searching;

import java.util.*;

public class CountOccurence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			int firstOcc = first_Occ(a, x);
			int lastOcc = last_Occ(a, x);
			int Occ = count_Occ(a, x);
			System.out.println("first occurrence of " + x + " = " + firstOcc);
			System.out.println("last occurrence of " + x + " = " + lastOcc);
			System.out.println("Occurrence of " + x + " = " + Occ);
		}

	}

	static int count_Occ(int a[], int n) {
		int first = first_Occ(a, n);
		int last = last_Occ(a, n);
		int Occ = last - first + 1;
		return Occ;
//		int low = 0;
//		int high = n - 1;
//		while (low <= high) {
//			int mid = low + (high - low) / 2;
//
//			if (a[mid] == 1 && (mid == n - 1 || a[mid + 1] == 0))
//				return (mid + 1);
//			if (a[mid] < 1)
//				high = mid - 1;
//			if (a[mid] >= 1)
//				low = mid + 1;
//		}
//		return 0;
	}

	static int first_Occ(int a[], int x) {
		int low = 0;
		int high = a.length - 1;
		int res = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == x) {
				res = mid;
				high = mid - 1;
			} else if (a[mid] < x)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return res;
	}

	static int last_Occ(int a[], int x) {
		int low = 0;
		int high = a.length - 1;
		int res = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == x) {
				res = mid;
				low = mid + 1;
			} else if (a[mid] < x)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return res;
	}

}
