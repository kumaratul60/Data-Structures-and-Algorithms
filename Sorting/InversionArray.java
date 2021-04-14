package Sorting;

import java.util.Scanner;

public class InversionArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			// long inv = countInversion(a, 0, n - 1);
			long inv = countInv(a, n);
			System.out.print(inv + " ");
		}
	}

	static long inversionCount(long a[], long n) {

		long res = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j])
					res++;
			}
		}
		return res;
	}

	static long inversionCountMerge(long a[], long left, long mid, long right) {

		long n1 = mid - left + 1;
		long n2 = right - mid;

		long leftA[] = new long[(int) n1];
		long rightA[] = new long[(int) n2];

		for (int i = 0; i < n1; i++)
			leftA[i] = a[(int) (left + i)];
		for (int i = 0; i < n2; i++)
			rightA[i] = a[(int) (mid + 1 + i)];

		long res = 0;
		int i = 0, j = 0;
		long k = left;
		while (i < n1 && j < n2) {
			if (leftA[i] <= rightA[j]) {
				a[(int) k] = leftA[i];
				i++;
			} else {
				a[(int) k] = rightA[j];
				j++;
				res = res + (n1 - i);
			}
			k++;
		}
		while (i < n1) {
			a[(int) k] = leftA[i];
			i++;
			k++;
		}
		while (j < n2) {
			a[(int) k] = rightA[j];
			j++;
			k++;
		}
		return res;

	}

	static long countInversion(long a[], long left, long right) {

		long res = 0;
		if (left < right) {
			long mid = left + (right - left) / 2;
			res += countInversion(a, left, mid);
			res += countInversion(a, mid + 1, right);

			res += inversionCountMerge(a, left, mid, right);

		}
		return res;
	}

	static long countInv(long a[], long n) {
		return countInversion(a, 0, n - 1);

	}

}
