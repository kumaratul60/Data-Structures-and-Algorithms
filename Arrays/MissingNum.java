package Arrays;

import java.util.Scanner;

public class MissingNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			Missing.missing(a, n+1);
			System.out.println(Missing.getMissingNo(a, n));
		}

	}
}

class Missing {
	static void missing(int a[], int n) {

		long total = ((long) n * (n + 1)) / 2;
		long sum = 0;
		for (int i = 0; i < n - 1; i++) {
			sum += a[i];
		}
		System.out.println(total - sum);
	}

	static int getMissingNo(int a[], int n) {
		int i, total;
		total = (n + 1) * (n + 2) / 2;
		for (i = 0; i < n; i++)
			total -= a[i];
		return total;
	}

}
