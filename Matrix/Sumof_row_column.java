package Matrix;

import java.util.Scanner;

public class Sumof_row_column {

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
			rowSum(a, n, m);
			colSum(a, n, m);
		}
	}

	static void rowSum(int a[][], int r, int c) {
		int i, j, sum = 0;
		System.out.print("\nFinding Sum of each row:\n\n");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				sum = sum + a[i][j];
			}
			System.out.println("Sum of the row " + i + " = " + sum);
			//sum = 0;
		}
	}

	static void colSum(int a[][], int r, int c) {
		int i, j, sum = 0;
		System.out.print("\nFinding Sum of each column:\n\n");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				sum += a[j][i];
			}
			System.out.println("Sum of the column " + i + " = " + sum);
			sum = 0;
		}
	}

}
