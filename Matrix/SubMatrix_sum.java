package Matrix;

import java.util.Scanner;

public class SubMatrix_sum {

	// Calculate sum of all elements in a sub-matrix in constant time

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while (t-- > 0) {
//			
//			int p = sc.nextInt();
//			int q = sc.nextInt();
//			int r = sc.nextInt();
//			int s = sc.nextInt();
//			
//			int a[][] = new int[p][q];
//			for (int i = 0; i < p; i++) {
//				for (int j = 0; j < q; j++)
//					a[i][j] = sc.nextInt();
//			}
//		}
//	}
		int[][] mat = { { 0, 2, 5, 4, 1 }, { 4, 8, 2, 3, 7 }, { 6, 3, 4, 6, 2 }, { 7, 3, 1, 8, 3 }, { 1, 5, 7, 9, 4 } };

		// (p, q) and (r, s) represents top-left and bottom-right
		// coordinates of the sub-matrix
		int p = 1, q = 1, r = 3, s = 3;

		// calculate sub-matrix sum
		System.out.print(findSubmatrixSum(mat, p, q, r, s));
	}

	private static int findSubmatrixSum(int[][] mat, int p, int q, int r, int s) {

		// pre-process the input matrix such that sum[i][j] stores
		// sum of elements in matrix from (0, 0) to (i, j)
		int[][] sum = new int[mat.length][mat[0].length];
		sum[0][0] = mat[0][0];

		// pre-process first row
		for (int j = 1; j < mat[0].length; j++) {
			sum[0][j] = mat[0][j] + sum[0][j - 1];
		}

		// pre-process first column
		for (int i = 1; i < mat.length; i++) {
			sum[i][0] = mat[i][0] + sum[i - 1][0];
		}

		// pre-process rest of the matrix
		for (int i = 1; i < mat.length; i++) {
			for (int j = 1; j < mat[0].length; j++) {
				sum[i][j] = mat[i][j] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
			}
		}

		/*
		 * total = sum[r][s] - sum[r][q - 1] - sum[p - 1][s] + sum[p - 1][q - 1];
		 */
		int total = sum[r][s];

		if (q - 1 >= 0) {
			total -= sum[r][q - 1];
		}

		if (p - 1 >= 0) {
			total -= sum[p - 1][s];
		}

		if (p - 1 >= 0 && q - 1 >= 0) {
			total += sum[p - 1][q - 1];
		}

		return total;
	}

}
