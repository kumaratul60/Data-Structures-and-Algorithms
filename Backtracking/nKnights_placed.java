package Backtracking;

import java.util.Scanner;

public class nKnights_placed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		boolean[][] grid = new boolean[n][n];
		nKnights(0, 0, n, 0, grid);
		System.out.println(ans);

	}

	static void display(boolean[][] grid, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j])
					System.out.print("K ");
				else
					System.out.print(". ");
			}
			System.out.println();
		}
		System.out.println("\n");

	}

	// if(grid[i][j]==true) === if(grid[i][j])

	static boolean isSafe(int row, int col, int n, boolean[][] grid) {

		if (row - 2 >= 0 && col - 1 >= 0 && grid[row - 2][col - 1])
			return false;
		if (row - 1 >= 0 && col - 2 >= 0 && grid[row - 1][col - 2])
			return false;
		if (row - 2 >= 0 && col + 1 < n && grid[row - 2][col + 1])
			return false;
		if (row - 1 >= 0 && col + 2 < n && grid[row - 1][col + 2])
			return false;

		return true;

	}

	static int ans = 0;

	static void nKnights(int curr_row, int curr_col, int n, int count, boolean[][] grid) {
		if (count == n) {
			ans++;
			display(grid, n);
			return;
		}
		for (int i = curr_row; i < n; i++) {
			for (int j = (i == curr_row) ? curr_col : 0; j < n; j++) {
				if (isSafe(i, j, n, grid)) {
					grid[i][j] = true;
					nKnights(i, j + 1, n, count + 1, grid);
					grid[i][j] = false;
				}
			}
		}

	}

}
