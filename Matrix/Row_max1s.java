package Matrix;

import java.util.Scanner;

public class Row_max1s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++)
					a[i][j] = sc.nextInt();
			}
			// System.out.println(rowWithMax1s(a, n, m));
			rowMax1(a, n, m);
		}
	}

	static int first(int a[], int low, int high) {
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if ((mid == 0 || (a[mid - 1] == 0)) && a[mid] == 1)
				return mid;
			else if (a[mid] == 0)
				return first(a, mid + 1, high);
			else
				return first(a, low, mid - 1);
		}
		return -1;
	}

	static int rowWithMax1s(int a[][], int r, int c) {

		int maxRowIndex = -1, max = -1;

		int i, index = 0;
		for (i = 0; i < r; i++) {
			index = first(a[i], 0, c - 1);
			if (index != -1 && c - index > max) {
				max = c - index;
				maxRowIndex = i;
			}
		}
		return maxRowIndex;
	}

	static void rowMax(int a[][], int r, int c) {
		int count = 0, max = -1, maxRowIndex = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (a[i][j] == 1) {
					count++;
				}
			}
			if (count > max) {
				maxRowIndex = i;
				max = count;
			}
		}
		System.out.println(maxRowIndex);
	}

	static void rowMax1(int a[][], int r, int c) {
		int maxRowIndex = 0;
		int curr_col = c - 1;
		for (int i = 0; i < r; i++) {
			while (curr_col >= 0 && a[i][curr_col] == 1) {
				curr_col = curr_col - 1;
				maxRowIndex = i;
			}
		}
		System.out.println(maxRowIndex);
	}
}
