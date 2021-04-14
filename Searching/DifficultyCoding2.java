package Searching;

import java.util.Scanner;

public class DifficultyCoding2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int i;

			int n = sc.nextInt();
			int a[] = new int[n];
			for (i = 0; i < n; i++)
				a[i] = sc.nextInt();
			DifficultyCoding2 dc = new DifficultyCoding2();
			System.out.println(dc.voat(a, n));
		}
	}

	static int voat(int a[], int n) {
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == 1)
				return i;
		}
		return index;

	}

}
