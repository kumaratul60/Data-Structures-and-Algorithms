package Recursion_ADV;

import java.util.Scanner;

public class ChaeckArray_Sorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(isSorted(a, 0, n));
		}

	}

	static boolean isSorted(int a[], int i, int n) {

		if (i == n - 1)
			return true;

		if (a[i] > a[i + 1])
			return false;
		else
			isSorted(a, i + 1, n);
		return false;
	}

}
