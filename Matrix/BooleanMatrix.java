package Matrix;

import java.util.Scanner;

public class BooleanMatrix {

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
		}
	}

	void booleanMatrix(int m[][]) {
		// code here
		int r = m.length;
		int c = m[0].length;

		int row[] = new int[r];
		int col[] = new int[c];

		for (int i = 0; i < r; i++)
			row[i] = 0;
		for (int i = 0; i < c; i++)
			col[i] = 0;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (m[i][j] == 1) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (row[i] == 1 || col[j] == 1)
					m[i][j] = 1;
			}
		}
	}

	public static void modifyMatrix(int mat[][]) {

		// variables to check if there are any 1
		// in first row and column
		boolean row_flag = false;
		boolean col_flag = false;

		// updating the first row and col if 1
		// is encountered
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (i == 0 && mat[i][j] == 1)
					row_flag = true;

				if (j == 0 && mat[i][j] == 1)
					col_flag = true;

				if (mat[i][j] == 1) {

					mat[0][j] = 1;
					mat[i][0] = 1;
				}

			}
		}

		// Modify the input matrix mat[] using the
		// first row and first column of Matrix mat
		for (int i = 1; i < mat.length; i++) {
			for (int j = 1; j < mat[0].length; j++) {

				if (mat[0][j] == 1 || mat[i][0] == 1) {
					mat[i][j] = 1;
				}
			}
		}

		// modify first row if there was any 1
		if (row_flag == true) {
			for (int i = 0; i < mat[0].length; i++) {
				mat[0][i] = 1;
			}
		}

		// modify first col if there was any 1
		if (col_flag == true) {
			for (int i = 0; i < mat.length; i++) {
				mat[i][0] = 1;
			}
		}
	}

}
