package Matrix;

import java.util.Scanner;

public class TransposeMatrix {

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
			transpose(a, n, m);

			printM(a, n, m);

		}
	}

	static void transpose(int a[][], int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < m; j++)
			// for (int j = i+1; j < m; j++)
			{
				// swap(a, i, j);
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;

			}
		}

	}

	static void swap(int mat[][], int i, int j) {
		int temp = mat[i][j];
		mat[i][j] = mat[j][i];
		mat[j][i] = temp;
	}

	static void printM(int a[][], int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	public int[][] transpose(int[][] A) {
		int rows = A.length;
		int columns = A[0].length;
		int result[][] = new int[columns][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[j][i] = A[i][j];
			}
		}
		return result;

	}

}
