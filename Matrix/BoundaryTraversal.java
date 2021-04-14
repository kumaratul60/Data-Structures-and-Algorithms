package Matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class BoundaryTraversal {

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

				// int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
				// 15, 16 } };

				bTraversal(a, n, m);
				// System.out.println(printBoundary(a, n, m));
			}
		}
	}

	// static int row = 4, col = 4;

	static void bTraversal(int a[][], int row, int col) {
		if (row == 1)
			for (int i = 0; i < col; i++)
				System.out.print(a[0][i] + " ");
		else if (col == 1)
			for (int i = 0; i < row; i++)
				System.out.print(a[i][0] + " ");
		else
			for (int i = 0; i < col; i++)
				System.out.print(a[0][i] + " ");
		for (int i = 1; i < row; i++)
			System.out.print(a[i][col - 1] + " ");
		for (int i = col - 2; i >= 0; i--)
			System.out.print(a[row - 1][i] + " ");
		for (int i = row - 2; i >= 0; i--)
			System.out.print(a[i][0] + " ");

	}

	static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m) {
		ArrayList<Integer> al = new ArrayList<>();

		if (n == 1)
			for (int i = 0; i < m; i++)
				al.add(matrix[0][i]);

		else if (m == 1)
			for (int i = 0; i < n; i++)
				al.add(matrix[i][0]);

		else {
			for (int i = 0; i < m; i++)
				al.add(matrix[0][i]);
			for (int i = 1; i < n; i++)
				al.add(matrix[i][m - 1]);
			for (int i = m - 2; i >= 0; i--)
				al.add(matrix[n - 1][i]);
			for (int i = n - 2; i >= 0; i--)
				al.add(matrix[i][0]);

		}
		return al;
	}

	static ArrayList<Integer> printBoundary(int a[][], int m, int n) {

		int sum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0) {
					sum += a[i][j];

				} else if (i == m - 1)
					sum += a[i][j];
				else if (j == 0)
					sum += a[i][j];
				else if (j == n - 1)
					sum += a[i][j];

			}
		}
		ArrayList<Integer> al = new ArrayList<>();
		al.add(sum);
		return al;
	}
}
