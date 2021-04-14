package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Merge2SortedArray {

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
			int[] merge = merge2(a, b, n, m);
			
			print(merge);

		}

	}

	static int[] merge2(int[] a, int[] b, int n, int m) {

		int res[] = new int[n + m];
		int i, j, k;
		i = j = k = 0;
		while (i < n && j < m) {
			if (a[i] < b[j]) {
				res[k] = a[i];
				i++;
				k++;
			} else {
				res[k] = b[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			res[k] = a[i];
			i++;
			k++;
		}
		while (j < m) {
			res[k] = b[j];
			j++;
			k++;
		}
		return res;
	}

	static void print(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

}
