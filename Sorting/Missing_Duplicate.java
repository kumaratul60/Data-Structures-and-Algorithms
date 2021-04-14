package Sorting;

import java.util.Scanner;

public class Missing_Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			new Missing_Duplicate();
			Missing_Duplicate.missing(a, n);
			// System.out.println(mis);
		}
	}

	static void missing(int a[], int n) {
		int i = 0;
		while (i < n) {
			if (a[i] != a[i - 1]) {
				int temp = a[i];
				a[i] = a[i - 1];
				a[i - 1] = temp;
			} else
				i++;
		}
		for (; i < n; i++) {
			if (a[i] != a[i + 1])
				System.out.println("missing num = " + i + 1 + " \n " + "Repeating Element = " + a[i]);

		}

	}

}
