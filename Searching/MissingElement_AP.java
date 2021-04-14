package Searching;

import java.util.Scanner;

public class MissingElement_AP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int mis = findMissing(a, n);
			System.out.println(mis);
		}
	}

	static int findMissingElement(int a[], int low, int high, int diff) {
		if (high <= low)
			return Integer.MAX_VALUE;
		int mid = low + (high - low) / 2;
		if (a[mid + 1] - a[mid] != diff)
			return (a[mid] + diff);
		if (mid > 0 && a[mid] - a[mid - 1] != diff)
			return a[mid - 1] + diff;
		if (a[mid] == a[0] + mid * diff)
			return findMissingElement(a, mid + 1, high, diff);
		return findMissingElement(a, low, mid - 1, diff);

	}

	static int findMissing(int a[], int n) {
		int diff = (a[n - 1] - a[0]) / n;
		return findMissingElement(a, 0, n - 1, diff);
	}

}
