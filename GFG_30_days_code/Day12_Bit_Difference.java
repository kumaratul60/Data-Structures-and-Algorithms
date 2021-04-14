package GFG_30_days_code;

import java.util.Scanner;

public class Day12_Bit_Difference {

//	Input: N = 5, arr[] = {3, 5, 2, 5, 2}
//	Output: 36

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(sumBitDiff(a, n));

		}

	}

	public static long sumBitDiff(int a[], int n) {

		long ans = 0; // Initialize result

		for (int i = 0; i < 32; i++) {
			int count = 0; // count number of elements with i'th bit set
			for (int j = 0; j < n; j++) {
				if ((a[j] & (1 << i)) == 0)
					count++;
//				if ((a[j] & (1 << i)) != 0 )
//					count++;

			}

			ans += (count * (n - count) * 2);

		}
		return ans;

	}

	static long sumBitDif(int a[], int n) {
		long ans = 0;

		for (int i = 0; i < 32; i++) {
			int c1 = 0;
			int c2 = 0;
			for (int j = 0; j < n; j++) {
				if ((a[j] & (1 << i)) != 0)

					c1++;
				else
					c2++;

				ans += c1 * c2;
			}

		}
		return 2 * ans;

	}

}
