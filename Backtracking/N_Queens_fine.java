package Backtracking;

import java.util.Scanner;

public class N_Queens_fine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();

			int a[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				a[i] = new int[n];
				for (int j = 0; j < n; j++) {
					a[i][j] = 0;
				}
			}

			if (nQueen(a, 0, n)) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(a[i][j] + " ");
					}
					System.out.println();
				}
			}

//			if (nQueen(a, 0, n)) {
//
//				System.out.println("Yes");
//			} else
//				System.out.println("No");

		}

	}

	static boolean isSafe(int a[][], int x, int y, int n) {
		for (int row = 0; row < x; row++) {
			if (a[row][y] == 1) {
				return false;
			}
		}
		int row = x;
		int col = y;
		while (row >= 0 && col >= 0) {
			if (a[row][col] == 1) {
				return false;
			}
			row--;
			col--;
		}

		// for right digonal

		row = x;
		col = y;
		while (row >= 0 && col < n) {
			if (a[row][col] == 1) {
				return false;
			}
			row--;
			col++;
		}
		return true;
	}

	
	static boolean nQueen(int a[][], int x, int n) {
		
		// x  = row
		
		if (x >= n) {
			return true;
		}

		for (int col = 0; col < n; col++) {
			if (isSafe(a, x, col, n)) {
				a[x][col] = 1;

				if (nQueen(a, x + 1, n)) {
					return true;
				}
				a[x][col] = 0; // Backtracking

			}
		}
		return false;
	}

}
