package Matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class SerachElement_sortedMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int x = sc.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++)
					a[i][j] = sc.nextInt();

				// sortedSearch(a, n, x);
				System.out.println(search1(a, n,m, x));
				//System.out.println(search1(a, n, m, x));

			}
		}
	}

	static void sortedSearch(int a[][], int n, int target) {
		boolean found = false;
		int row = 0;
		int col = n - 1;
		while (row < n && col >= 0) {
			if (a[row][col] == target) {
				System.out.println(row + " " + col);

				found = true;

			}
			if (a[row][col] > target)
				col--;
			else
				row++;

		}
		if (found)
			System.out.println(true);
		else
			System.out.println(false);

	}

	static void sortedSearch1(int a[][], int n, int target) {
		int row = 0;
		int col = n - 1;
		while (row < n && col >= 0) {
			if (a[row][col] == target) {
				System.out.println(row + " " + col);
				return;

			} else if (a[row][col] > target)
				col--;
			else
				row++;

		}
		// System.out.println("Not Found");
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		for (int i = 0; i < matrix.length; i++) {
			if (i + 1 == matrix.length || matrix[i + 1][0] > target) {
				for (int j = 0; j < matrix[i].length; j++) {
					if (matrix[i][j] == target)
						return true;
				}
			}
		}
		return false;

	}

	static boolean search(int a[][], int n, int m, int x) {
		int i = 0, j = m - 1;
		while (i < n && j >= 0) {
			if (a[i][j] > x) {
				j--;
			} else if (a[i][j] < x) {
				i++;
			} else {
				return true;
			}
		}
		return false;
	}

	static int search1(int a[][], int n, int m, int x) {
		int i = 0, j = m - 1;
		while (i < n && j >= 0) {
			if (a[i][j] > x) {
				j--;
			} else if (a[i][j] < x) {
				i++;
			} else {
				return a[i][j];
			}
		}
		return a[i][j];
	}

}
