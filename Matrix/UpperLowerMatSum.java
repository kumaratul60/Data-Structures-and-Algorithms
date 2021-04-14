package Matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class UpperLowerMatSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();

			int a[][] = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();

			sumTriangles(a, n);
		}

	}

	static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
		int upper = 0; // upper triangle sum
		int lower = 0; // lower triangle sum

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				// The diagonal will be common
				// to both upper sum and lower sum
				if (i == j) {
					upper += matrix[i][j];
					lower += matrix[i][j];
				}

				// condition for upper triangle
				else if (j > i)
					upper += matrix[i][j];

				// condition for lower triangle
				else if (j < i)
					lower += matrix[i][j];
			}
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(upper);
		result.add(lower);
		return result;
	}


	static void sumTriangles1(int matrix[][], int n) {

		int row = matrix.length;
		int col = matrix[0].length;

		int upperTringles = 0;
		int lowerTringles = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i <= j)
					upperTringles += matrix[i][j];

			}

		}

		System.out.print(upperTringles + " ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i <= j)
					lowerTringles += matrix[i][j];
			}

		}

		System.out.print(lowerTringles);

	}

	static void summatrix(int mat[][], int n) {
		/** Your code here **/
		int sum_UpperTraingle = 0, sum_LowerTriangle = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = i; j < mat[0].length; j++)
				sum_UpperTraingle += mat[i][j];
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j <= i; j++)
				sum_LowerTriangle += mat[i][j];
		}
		System.out.print(sum_UpperTraingle + " " + sum_LowerTriangle);

	}

}
