package Sorting;

import java.util.Scanner;

public class ZeroToEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			new ZeroToEnd();
			pushZero(a, n);

			print(a, n);
		}
	}

	static void pushZero(int a[], int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != 0)
				a[count++] = a[i];
		}
		while (count < n) {
			a[count++] = 0;
		}

	}

	static void print(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i]);
	}

}
