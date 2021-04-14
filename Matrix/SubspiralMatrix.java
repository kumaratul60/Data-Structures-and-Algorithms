package Matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class SubspiralMatrix {

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
			System.out.println("spiral sub matrix ");
			spiral(a);
			System.out.println();
			System.out.println("sum of sub matrix " + sumMatrix(a));
		}
	}

	static void spiral(int a[][]) {

		int n = a.length;
		int m = a[0].length;
		int row_start = 1, row_end = n - 2, col_start = 1, col_end = m - 2;

		while (row_start <= row_end && col_start <= col_end) {

			// for row_start
			for (int col = col_start; col <= col_end; col++) {
				System.out.print(a[row_start][col] + " ");
			}
			row_start++;

			// for column_end
			for (int row = row_start; row <= row_end; row++) {
				System.out.print(a[row][col_end] + " ");
			}
			col_end--;

			// for row_end
			for (int col = col_end; col >= col_start; col--) {
				System.out.print(a[row_end][col] + " ");
			}
			row_end--;

			// for column_start
			for (int row = row_end; row >= row_start; row--) {
				System.out.print(a[row][col_start] + " ");
			}
			col_start++;

		}

	}

	static int sumMatrix(int a[][]) {
		int n = a.length;
		int m = a[0].length;
		int sum = 0;
		//spiral(a);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				sum += a[i][j];
		}

		return sum;

	}

}
