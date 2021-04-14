package Backtracking;

public class BlockMaze {

	public static void main(String[] args) {
		int grid[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
		
//		int grid[][] = { { 0, 0, 1, 0, 0, 1, 0 }, { 1, 0, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 1 },
//		{ 1, 0, 1, 0, 0, 0, 0 }, { 1, 0, 1, 1, 0, 1, 0 }, { 1, 0, 0, 0, 0, 1, 0 }, { 1, 1, 1, 1, 0, 0, 0 } };


		boolean visited[][] = new boolean[grid.length][grid[0].length];

		mazeRun(grid, 0, 0, " ", visited);
		System.out.println(count);
	}

	static int count = 0;

	static void mazeRun(int[] maze[], int row, int col, String ans, boolean[][] visited) {

		if (row == maze.length - 1 && col == maze[0].length - 1) {
			count++;
			System.out.println(ans);
			return;
		}
		if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || visited[row][col]
				|| maze[row][col] == 1) {
			return;
		}
		
//		if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || visited[row][col]
//				|| maze[row][col] != 1) {
//			return;
//		}

		visited[row][col] = true;

		mazeRun(maze, row - 1, col, ans + "T", visited);
		mazeRun(maze, row + 1, col, ans + "D", visited);
		mazeRun(maze, row, col - 1, ans + "L", visited);
		mazeRun(maze, row, col + 1, ans + "R", visited);

		visited[row][col] = false; // backtracking

	}

}
