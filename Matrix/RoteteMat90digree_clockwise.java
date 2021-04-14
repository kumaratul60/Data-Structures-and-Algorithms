package Matrix;

import java.util.Scanner;

public class RoteteMat90digree_clockwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					a[i][j] = sc.nextInt();

			rotate(a);
			printMatrix(a);
		}
	}

	static void rotate(int mat[][]) {
		transpose_colchage(mat);

	}

	static void transpose_colchage(int matrix[][]) {
		int len = matrix.length;
		for (int i = 0; i < len; i++) 
			for (int j = i; j < len; j++) {
				int temp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = temp;
			
		}
		for (int i = 0; i < len; i++) 
			for (int j = 0, k = len - 1; j < k; j++, k--) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][k];
				matrix[i][k] = temp;
			
		}
	}

/////////////////////////////////////////////////////////////////////////////////
	static void rotate1(int[][] a) {
		int n = a.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - 1 - i; j++) {
				// 90 degree rotate
				int temp = a[i][j];
				a[i][j] = a[n - 1 - j][i];
				a[n - 1 - j][i] = a[n - 1 - i][n - 1 - j];
				a[n - 1 - i][n - 1 - j] = a[j][n - 1 - i];
				a[j][n - 1 - i] = temp;
			}
		}
	}
	// rotate each layer

	static void rotate2(int[][] matrix) {
		for (int layer = 0; layer + layer + 1 < matrix.length; layer++) {
			rotate(matrix, layer);
		}
	}

	private static void rotate(int[][] matrix, int layer) {
		int left = layer, right = matrix.length - layer - 1, top = left, bottom = right;

		for (int diff = 0; diff < right - left; diff++) {
			swap(matrix, top, left + diff, top + diff, right);
			swap(matrix, top, left + diff, bottom, right - diff);
			swap(matrix, top, left + diff, bottom - diff, left);
		}
	}

	private static void swap(int[][] matrix, int y1, int x1, int y2, int x2) {
		int tmp = matrix[y1][x1];
		matrix[y1][x1] = matrix[y2][x2];
		matrix[y2][x2] = tmp;
	}

	/////////////////////////////////////////////////////////////////////////////////

	static void printMatrix(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println("");
		}
	}

	///////////////////////////////////////////////////////////////////////////

	static void swap(int arr[][]) {
		for (int i = 0; i < arr.length; i++)
			for (int j = i; j < arr[0].length; j++) {
//		int temp = arr[j][i];
//		arr[j][i] = arr[i][j];
//		arr[i][j] = temp;
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
	}

}
