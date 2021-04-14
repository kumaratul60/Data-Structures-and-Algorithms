package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int repeate = findRepete(a, n);
			System.out.println(repeate);

		}

	}
//	static int missing_repeat(int a[],int n) {
//		
//		findRepete(a,n);
//		missing(a,n);
//		return -1;
//	}
	static long missing(int a[], int n) {

		long total = ((long) n * (n + 1)) / 2;
		long res = 0;
		long sum = 0;
		for (int i = 0; i < n - 1; i++) {
			sum += a[i];
			res = total-sum;
		}
		return res;
	}

	static int findDuplicate(int a[], int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j])
					return a[i];
			}
		}
		return -1;
	}

	static int findDupli(int a[], int n) {
		Arrays.sort(a);
		for (int i = 0; i < n - 1; i++) {
			if (a[i] == a[i + 1])
				return a[i];

		}
		return -1;
	}

	static int findRepete(int a[], int n) {

		// Traverse an array
		for (int i = 0; i < n; i++) {

			// Returns the absolute value
			int index = Math.abs(a[i]);

			if (a[index] < 0)
				return index;
			else
				a[index] = -a[index];
		}
		return -1;

	}

}
