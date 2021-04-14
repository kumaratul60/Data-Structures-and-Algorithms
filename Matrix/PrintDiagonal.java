package Matrix;

import java.util.Scanner;

public class PrintDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			primaryDiagonal(a, n, m);
			secondaryDiagonal(a, n, m);
		}

	}

	static void primaryDiagonal(int a[][], int n, int m) {
		System.out.print("Principal Diagonal: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == j) {
					System.out.print(a[i][j] + ",");
				}

			}
		}
		System.out.println();

	}

	static void secondaryDiagonal(int a[][], int n, int m) {
		System.out.print("Secondary Diagonal: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if ((i + j) == (n - 1)) {
					System.out.print(a[i][j] + ",");
				}

			}
		}
		System.out.println();

	}

	// Method 2
	public static void printPrincipalDiagonal(int mat[][], int n) {
		System.out.print("Principal Diagonal: ");

		for (int i = 0; i < n; i++) {
// Printing principal diagonal
			System.out.print(mat[i][i] + ", ");
		}
		System.out.println();
	}

//Function to print the Secondary Diagonal
	public static void printSecondaryDiagonal(int mat[][], int n) {
		System.out.print("Secondary Diagonal: ");
		int k = n - 1;

		for (int i = 0; i < n; i++) {
// Printing secondary diagonal
			System.out.print(mat[i][k--] + ", ");
		}
		System.out.println();
	}

}
