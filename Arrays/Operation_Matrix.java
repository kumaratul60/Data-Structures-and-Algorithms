package Arrays;

import java.util.Scanner;

public class Operation_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		//int m = sc.nextInt();

		int a[][] = new int[n][n];
		int b[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextInt();

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				b[i][j] = sc.nextInt();

		}
		int c[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();

		}
		int d[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				 d[i][j] = 0;
				for(int k=0;k<n;i++)
				
					d[i][j] += a[i][k] * b[k][j];
				
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();

		}

	}

}
