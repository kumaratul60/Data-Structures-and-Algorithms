package GFG_30_days_code;

import java.util.Arrays;
import java.util.Scanner;

// Given an array of size N, find the number of distinct 
//pairs {a[i], a[j]} (i != j) in the array with their sum greater than 0.

public class Day7_valid_Piar_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(ValidPair(a, n));
		}

	}

	static long ValidPair(int a[], int n) {

		Arrays.sort(a);
		long res = 0;
		//int len = a.length;
		int p = 0, q = n - 1;

		while (p < q) {
			if (a[p] + a[q] > 0) {
				res += q - p; // updating result
				q--;
			} else
				p++;
		}

		return res;

	}

}
