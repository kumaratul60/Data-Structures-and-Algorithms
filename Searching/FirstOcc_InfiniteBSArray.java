package Searching;

import java.util.Scanner;

public class FirstOcc_InfiniteBSArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			// int x = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			int index = find(a);
			System.out.println(index);
		}

	}

	static int find(int a[]) {
		int low = 0;
		int high = 1;
		while (a[high] < 1) {
			low = high;
			high *= 2;
		}

		return firstOcc(a);

	}

	static int firstOcc(int a[]) {
		int low = 0;
		int high = a.length - 1;
		int res = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == 1) {
				res = mid;
				high = mid - 1; 
				

			} else if (a[mid] > 1)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return res;
	}

	static int lastOcc(int a[]) {
		int low = 0;
		int high = a.length - 1;
		int res = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == 1) {
				res = mid;
				low = mid + 1;
			} else if (a[mid] > 1)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return res;
	}

	static int countOcc(int a[]) {
		int first = firstOcc(a);
		int last = lastOcc(a);
		int resCount = last - first + 1;
		return -1;
	}

}
