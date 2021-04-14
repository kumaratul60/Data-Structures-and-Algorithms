package Matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class Spiral_Matrix {
	
	// 1 2 3 4 8 7 6 5 9 10 11 12 16 15 14 13 

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
				Spiral_Matrix.spiral(a, n, m);
			}
		}
	}

	static void spiral(int a[][], int n, int m) {
		int row_start = 0, row_end = n - 1, col_start = 0, col_end = m - 1;

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

	static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {

		int row_Start = 0, col_Start = 0;
		int row_end = r - 1, col_end = c - 1;

		ArrayList<Integer> al = new ArrayList<>();

		while (row_Start <= row_end && col_Start <= col_end) {

			for (int i = col_Start; i <= col_end; i++) {
				al.add(matrix[row_Start][i]);
			}
			row_Start++;
			for (int i = row_Start; i <= row_end; i++) {
				al.add(matrix[i][col_end]);
			}
			col_end--;

			if (row_Start <= row_end) {
				for (int i = col_end; i >= col_Start; i--) {
					al.add(matrix[row_end][i]);
				}
				row_end--;
			}
			if (col_Start <= col_end) {
				for (int i = row_end; i >= row_Start; i--) {
					al.add(matrix[i][col_Start]);
				}
				col_Start++;
			}
		}
		return al;
	}

}
