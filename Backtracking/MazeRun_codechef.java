package Backtracking;

public class MazeRun_codechef {

	public static void main(String[] args) {

		// int grid[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1
		// } };

		int grid[][] = { { 0, 0, 1, 0, 0, 1, 0 }, { 1, 0, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 1 },
				{ 1, 0, 1, 0, 0, 0, 0 }, { 1, 0, 1, 1, 0, 1, 0 }, { 1, 0, 0, 0, 0, 1, 0 }, { 1, 1, 1, 1, 0, 0, 0 } };

		System.out.println(countMazePath(grid));

	}

	static int totalPath = 0;

	static boolean isSafe(int i, int j, int n, boolean[][] visited) {
		 return i>=0 && j>=0 && i<n && j<n && visited[i][j] == false;
//		if (i >= 0 && j >= 0 && i < n && j < n && visited[i][j] == false)
//			return true;
//		return false;

	}

	static void helper(int i, int j, int n, int grid[][], boolean[][] visited) {
		if (i == n - 1 && j == n - 1) {
			totalPath++;
			return;
		}
		if (!(isSafe(i, j, n, visited))) {
			// pruning
			return;
		}
		visited[i][j] = true;

		// recusion
		if (i + 1 < n && grid[i + 1][j] == 0) { // up
			helper(i + 1, j, n, grid, visited);
		}
		if (i - 1 >= 0 && grid[i - 1][j] == 0) { // down
			helper(i - 1, j, n, grid, visited);
		}
		if (j + 1 < n && grid[i][j + 1] == 0) { // left
			helper(i, j + 1, n, grid, visited);
		}
		if (j - 1 >= 0 && grid[i][j - 1] == 0) { // right
			helper(i, j - 1, n, grid, visited);
		}

		visited[i][j] = false;
		return;
	}

	static int countMazePath(int grid[][]) {
		int n = grid.length;
		boolean visited[][] = new boolean[n][n];
		helper(0, 0, n, grid, visited);
		return totalPath;
	}

}
