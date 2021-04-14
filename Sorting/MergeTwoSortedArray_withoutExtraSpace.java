package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray_withoutExtraSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int m = sc.nextInt();
			int[] b = new int[m];
			for (int i = 0; i < m; i++)
				b[i] = sc.nextInt();
			new MergeTwoSortedArray_withoutExtraSpace();
			// System.out.println(MergeTwoSortedArray.merge(a, b, m, n));
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));

		}
	}

	public static void merge(int a[], int b[], int m, int n) {
		for (int i = 0; i < m; i++) {
			if (a[i] > b[0]) {
				int temp = a[i];
				a[i] = b[0];
				b[0] = temp;
				int first = b[0];
				int k;
				for (k = 1; k < n && b[k] < first; k++) {
					b[k - 1] = b[k];
				}
				b[k - 1] = first;

			}

		}

	}

}
