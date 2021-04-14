package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Counting_Possible_Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int triangle = findNumberOfTriangles(a, n);
			System.out.println(triangle);
		}
	}

	static int findNumberOfTriangles(int a[], int n) {
		Arrays.sort(a);

		int count = 0;

		for (int i = 0; i < n; i++) {
			int k = i + 2;
			for (int j = i + 1; j < n; j++) {
				while (k < n && a[i] + a[j] > a[k])
					k++;

				if (k > j)
					count += k - j - 1;

			}
		}
		return count;
	}

	static int findNumberOfTriangle(int a[], int n) {
		// code here
		Arrays.sort(a);
		int count = 0;
		for (int i = n - 1; i > 0; i--) {
			int l = 0;
			int r = i - 1;
			while (l < r) {
				if (a[l] + a[r] > a[i]) {
					count += r - l;
					r--;
				} else
					l++;
			}
		}
		return count;
	}

}
