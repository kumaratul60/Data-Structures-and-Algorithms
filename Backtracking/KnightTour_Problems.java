package Backtracking;

import java.util.Scanner;

public class KnightTour_Problems {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] grid = new int[n][n];
		boolean[][] visi = new boolean[n][n];
		knightTour(grid, n, 0, 0, 0, visi);

	}

	static void display(int[][] grid, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}

	static boolean isSafe(int[][] grid, int n, int row, int col, boolean[][] visited) {
		return row >= 0 && col >= 0 && row < n && col < n && visited[row][col] == false;
	}

	static void knightTour(int[][] grid, int n, int row, int col, int count, boolean[][] visited) {

		if (count == n * n - 1) {
			grid[row][col] = count;
			display(grid, n);
			System.out.println("\n");
			return;
		}
		if (count >= n * n)
			return;

		int xdir[] = { -2, -2, -1, -1, 2, 2, 1, 1 };
		int ydir[] = { -1, -2, 1, 2, 1, 2, -1, -2 };

		visited[row][col] = true;
		
		grid[row][col] = count;
		for (int i = 0; i < 8; i++) {
			if (isSafe(grid, n, row + xdir[i], col + ydir[i], visited)) {

				knightTour(grid, n, row + xdir[i], col + ydir[i], count + 1, visited);

			}
		}
		grid[row][col] = -1;
		visited[row][col] = false;
	}

}
