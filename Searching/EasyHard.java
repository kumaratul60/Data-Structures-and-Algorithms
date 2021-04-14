package Searching;

import java.util.Scanner;

public class EasyHard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();

			}
			System.out.println(tp(a, n));
		}

	}

	static String tp(int a[], int n) {
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == 1)
				return "hard";
			else if (a[mid] >= 1)
				high = mid - 1;
			else
				low = mid + 1;

		}
		return "easy";
	}

}
