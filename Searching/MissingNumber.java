package Searching;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int mis = findMissing(a, n);
			System.out.println(mis);
		}
	}

	static int segregate(int a[], int n) {
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] <= 0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}
		}
		return j;
	}

	static int fingMissingPositive(int a[], int n) {
		for (int i = 0; i < n; i++) {
			int x = Math.abs(a[i]);
			if (x - 1 < n && a[x - 1] > 0)
				a[x - 1] = -a[x - 1];
		}
		for (int i = 0; i < n; i++) {
			if (a[i] > 0)
				return i + 1;
		}
		return n + 1;

	}

	static int findMissing(int a[], int n) {
		int shift = segregate(a, n);
		int a2[] = new int[n - shift];
		int j = 0;
		for (int i = shift; i < n; i++) {
			a2[j] = a[i];
			j++;
		}
		return fingMissingPositive(a2, j);
	}

}
