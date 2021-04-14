package Recursion_ADV;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			System.out.println(sort(a, n));
		}
	}

	static boolean sort(int[] a, int n) {
		if (n == 1)
			return true;

		return a[0] < a[1] && sort(a, n - 1);

	}

}