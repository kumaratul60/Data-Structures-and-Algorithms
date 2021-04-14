package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class Union_2Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[m];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < m; i++)
			b[i] = sc.nextInt();
		System.out.println(unionArray(a, b));

	}

	private static int unionArray(int[] a, int[] b) {

		int n = a.length;
		int m = b.length;

		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < n; i++)
			hs.add(a[i]);

		for (int i = 0; i < m; i++)
			hs.add(b[i]);

		return hs.size();
	}

	static int union(int a[], int b[]) {

		int n = a.length;
		int m = b.length;

		int c[] = new int[n + m];

		for (int i = 0; i < n; i++)
			c[i] = a[i];

		for (int i = 0; i < m; i++)
			c[m + i] = b[i];

		int res = 0;
		for (int i = 0; i < n+m; i++) {
			boolean flag = false;

			for (int j = 0; j < i; j++) {
				if (c[i] == c[j]) {
					flag = true;
					break;
				}
				if (flag == false)
					res++;
			}
		}
		return res;
	}

}
