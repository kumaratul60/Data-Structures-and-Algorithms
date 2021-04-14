package Recursiion;

import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i : a)
				a[i] = sc.nextInt();
			int sum = sumRecursive(a, n - 1);
			System.out.println(sum);

		}
	}

	static int sumRecursive(int a[], int n) {
		if (n == 0)
			return a[0];

		// return a[n - 1] + sumRecursive(a, n - 1);
		return a[n - 1] + sumRecursive(a, n - 1);
	}

}
