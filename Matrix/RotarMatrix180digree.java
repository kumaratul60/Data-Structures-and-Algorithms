package Matrix;

import java.util.Scanner;

public class RotarMatrix180digree {

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
			rotateMatrix(a, n, m);
		}
	}

	static void rotateMatrix(int mat[][], int n, int m) {

		// Simply print from last
		// cell to first cell.
		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j >= 0; j--)
				System.out.print(mat[i][j] + " ");

			System.out.println();
		}
	}

}
