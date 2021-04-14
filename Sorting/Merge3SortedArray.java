package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Merge3SortedArray {

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
			int x = sc.nextInt();
			int[] c = new int[x];
			for (int i = 0; i < x; i++)
				c[i] = sc.nextInt();
			new Merge3SortedArray();
			System.out.println(Merge3SortedArray.merge3sorted(a, b, c));

		}

	}

	static ArrayList<Integer> merge3sorted(int a[], int b[], int c[]) {

		int n = a.length;
		int m = b.length;
		int x = c.length;

		ArrayList<Integer> d = new ArrayList<Integer>(n + m + x);
		int i = 0, j = 0, k = 0;
		while (i < n && j < m && k < x) {
			int A = a[i];
			int B = b[j];
			int C = c[k];
			if (A <= B && A <= C) {
				d.add(A);
				i++;
			} else if (B <= A && B <= C) {
				d.add(B);
				j++;
			} else {
				d.add(C);
				k++;
			}
		}

		// next three while loop is to sort two
		// of arrays if one of the three gets exhausted
		while (i < n && j < m) {
			if (a[i] < b[j]) {
				d.add(a[i]);
				i++;
			} else {
				d.add(b[j]);
				j++;
			}

		}

		while (j < n && k < x) {
			if (b[j] < c[k]) {
				d.add(b[j]);
				j++;
			} else {
				d.add(c[k]);
				k++;
			}
		}
		while (i < n && k < x) {
			if (a[i] < c[k]) {
				d.add(a[i]);
				i++;
			} else {
				d.add(c[k]);
				k++;
			}
		}

		// if one of the array are left then
		// simply appending them as there will
		// be only largest element left
		while (i < n) {
			d.add(a[i]);
			i++;
		}
		while (j < m) {
			d.add(b[j]);
			j++;
		}
		while (k < x) {
			d.add(c[k]);
			k++;
		}
		return d;
	}

}
