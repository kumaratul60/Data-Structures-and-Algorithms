package Searching;

import java.util.Scanner;

public class CountOnes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int countOnes = countOnes(a, n);
			System.out.println(countOnes);

		}
	}

	static int countOnes(int a[], int n) {

		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;

				 if (a[mid] == 1 && (mid == n - 1 || a[mid + 1] == 0))
				return (mid + 1);
			if (a[mid] < 1)
				high = mid - 1;
			if (a[mid] >= 1)
				low = mid + 1;
		}
		return 0;
	}

}
