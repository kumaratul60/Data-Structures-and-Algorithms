package Searching;

import java.util.Scanner;

public class DifficultyCoding {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			String dcode = code(a, 0, n - 1);
			System.out.println(dcode);
		}

	}

	static String code(int a[], int low, int high) {

		if (low > high)
			return "easy";
		int mid = low + (high - low) / 2;
		if (a[mid] == 1 && (mid == 0 || a[mid - 1] == 0))
			return "hard";
		else if (a[mid] == 0)
			return code(a, mid + 1, high);
		else
			return code(a, low, mid - 1);
		

		

	}

}
