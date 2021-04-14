package Matrix;

import java.util.Scanner;

public class RoteteMat90digree {
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
			rotate90(a, n, m);
			printMatrix(a);
		}

	}

	static void rotate90(int mat[][], int n, int m) {

		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < m; j++)
				swap(mat, i, j);

		for (int i = 0; i < n; i++) {
			int low = 0, high = n - 1;

			while (low < high) {
				swap2(low, high, i, mat);
				

				low++;
				high--;
			}
		}
	}

	static void swap(int mat[][], int i, int j) {
		int temp = mat[i][j];
		mat[i][j] = mat[j][i];
		mat[j][i] = temp;
	}

	static void swap2(int low, int high, int i, int mat[][]) {
		int temp = mat[low][i];
		mat[low][i] = mat[high][i];
		mat[high][i] = temp;                  
	}

	static void printMatrix(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println("");
		}
	}

}
