package Searching;

import java.util.Scanner;

public class TernarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();

			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			// int search = ternarySearch(0, n - 1, x, a);
			int search = IternarySearch(0, n - 1, x, a);
			System.out.println(search);
		}
	}

	// Recursive Function to perform Ternary Search
	// Initially,
	// l = 0, starting index of array.
	// r = N-1, ending index of array.
	static int ternarySearch(int l, int r, int key, int ar[]) {
		if (r >= l) {
			// Find mid1 and mid2
			int mid1 = l + (r - l) / 3;
			int mid2 = r - (r - l) / 3;

			// Check if key is present at any mid
			if (ar[mid1] == key) {
				return mid1;
			}
			if (ar[mid2] == key) {
				return mid2;
			}

			// Since key is not present at mid,
			// check in which region it is present
			// then repeat the Search operation
			// in that region
			if (key < ar[mid1]) {

				// The key lies in between l and mid1
				return ternarySearch(l, mid1 - 1, key, ar);
			} else if (key > ar[mid2]) {

				// The key lies in between mid2 and r
				return ternarySearch(mid2 + 1, r, key, ar);
			} else {

				// The key lies in between mid1 and mid2
				return ternarySearch(mid1 + 1, mid2 - 1, key, ar);
			}
		}

		// Key not found
		return -1;
	}

	// Iterative Function to perform Ternary Search
	// Initially,
	// l = 0, starting index of array.
	// r = N-1, ending index of array.
	static int IternarySearch(int l, int r, int key, int ar[]) {
		while (r >= l) {

			// Find mid1 and mid2
			int mid1 = l + (r - l) / 3;
			int mid2 = r - (r - l) / 3;

			// Check if key is present at any mid
			if (ar[mid1] == key) {
				return mid1;
			}
			if (ar[mid2] == key) {
				return mid2;
			}

			// Since key is not present at mid,
			// check in which region it is present
			// then repeat the Search operation
			// in that region

			if (key < ar[mid1]) {

				// The key lies in between l and mid1
				r = mid1 - 1;
			} else if (key > ar[mid2]) {

				// The key lies in between mid2 and r
				l = mid2 + 1;
			} else {

				// The key lies in between mid1 and mid2
				l = mid1 + 1;
				r = mid2 - 1;
			}
		}

		// Key not found
		return -1;
	}

}
