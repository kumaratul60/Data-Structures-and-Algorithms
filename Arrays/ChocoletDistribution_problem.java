package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ChocoletDistribution_problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(findMinDiff(a, n, m));

		}

	}

	static int findMinDiff(int a[], int n, int m) {
		// if there are no chocolates or
		// number of students is 0
		if (m == 0 || n == 0)
			return 0;

		// Sort the given packets
		Arrays.sort(a);

		// Number of students cannot be
		// more than number of packets
		if (n < m)
			return -1;

		// Largest number of chocolates
		int min_diff = Integer.MAX_VALUE;

		for (int i = 0; i + m - 1 < n; i++) {
			int diff = a[i + m - 1] - a[i];
			if (diff < min_diff)
				min_diff = diff;
		}
		return min_diff;
	}

}
