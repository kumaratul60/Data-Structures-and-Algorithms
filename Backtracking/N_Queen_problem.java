package Backtracking;

import java.util.Scanner;

public class N_Queen_problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		boolean[][] grid = new boolean[n][n];
		countQueen(grid, 0, n);
		System.out.println(count);

	}

	static int count = 0;

	private static boolean isSafe(boolean[][] grid, int row, int col, int n) {

		// column check
		for (int i = row - 1; i >= 0; i--) {
			if (grid[i][col] == true)
				return false;
		}

		// left upper diagonal
		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (grid[i][j] == true)
				return false;
		}

		// Right upper diagonal
		for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
			if (grid[i][j] == true)
				return false;
		}

		return true;
	}

	static void display(boolean[][] grid, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j])
					System.out.print("Q ");
				else
					System.out.print(". ");
			}
			System.out.println();
		}
	}

	static void countQueen(boolean[][] grid, int curr_row, int n) {
		if (curr_row == n) {

			// we found one way to place queen
			count++;
			display(grid, n);
			System.out.println("\n");
			return;
		}
		for (int i = 0; i < n; i++) {
			// I'll go to each spot/column
			if (isSafe(grid, curr_row, i, n)) {
				grid[curr_row][i] = true;
				countQueen(grid, curr_row + 1, n);
				grid[curr_row][i] = false;
			}
		}
	}

}
