package GFG_30_days_code;

import java.util.ArrayList;
import java.util.Arrays;

// Spiral Matrix

public class Day5 {

	public static void main(String[] args) {

		int n = 3, m = 3, k = 4;
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(findK1(a, n, m, k));
	}

	public static int findK(int a[][], int n, int m, int k) {
		int res = 0;
		int count = 0;

		int ns = 0, ms = 0;
		int nl = n - 1, ml = m - 1;

		while (ns <= nl && ms <= ml) {

			for (int i = ms; i <= ml; i++) {

				count++;
				if (count == k)

					res = a[ns][i];
			}

			ns++;

			for (int i = ns; i <= nl; i++) {

				count++;
				if (count == k)

					res = a[i][ml];
			}

			ml--;

			for (int i = ml; i >= ms; i--) {

				count++;
				if (count == k)

					res = a[nl][i];
			}

			nl--;

			for (int i = nl; i >= ns; i--) {

				count++;
				if (count == k)

					res = a[i][ms];
			}

			ms++;
		}
		return res;

	}

	public static int findK1(int a[][], int n, int m, int k) {

		int count = 0;

		int ns = 0, ms = 0;
		int nl = n - 1, ml = m - 1;

		ArrayList<Integer> al = new ArrayList<>();

		while (ns <= nl && ms <= ml) {

			for (int i = ms; i <= ml; i++) {

				count++;
				if (count == k)

					al.add(a[ns][i]);
			}

			ns++;

			for (int i = ns; i <= nl; i++) {

				count++;
				if (count == k)

					al.add(a[i][ml]);

			}

			ml--;

			for (int i = ml; i >= ms; i--) {

				count++;
				if (count == k)

					al.add(a[nl][i]);

			}

			nl--;

			for (int i = nl; i >= ns; i--) {

				count++;
				if (count == k)

					al.add(a[i][ms]);

			}

			ms++;
		}

		Integer[] array = {}; // new Integer[n]
		array = al.toArray(array);

		for (int res : array) {

			return res;
		}
		return -1;

	}

}
