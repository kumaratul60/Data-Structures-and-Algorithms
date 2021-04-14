package Backtracking;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			// int m = sc.nextInt();
			int arr[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			// stores number of unique paths from source to destination

			// 2D matrix to keep track of cells involved in current path
			// boolean[][] visited = new boolean[N][N];

			// start from source cell (0, 0)
			// countPaths(maze, 0, 0, visited);
			// System.out.println("Total number of unique paths are " + count);
			int solArr[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					solArr[i][j] = 0;
				}
			}

			if (countPaths(arr, 0, 0, n, solArr)) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(solArr[i][j] + " ");
					}
					System.out.println();
				}
			}
		}
	}

	private static boolean isValidCell(int x, int y, int N) {
		if (x < 0 || y < 0 || x >= N || y >= N)
			return false;

		return true;
	}

	static boolean countPaths(int maze[][], int x, int y, int N, int sol[][]) {
		// if destination (bottom-rightmost cell) is found,
		// increment the path count
		if (x == N - 1 && y == N - 1) {
			sol[x][y] = 1;
		}

		// mark current cell as visited
		sol[x][y] = 1;

		// if current cell is a valid and open cell
		if (isValidCell(x, y, N) && maze[x][y] == 1) {
			// go down (x, y) --> (x + 1, y)

			countPaths(maze, x + 1, y, N, sol);

			// go up (x, y) --> (x - 1, y)

			countPaths(maze, x - 1, y, N, sol);

			// go right (x, y) --> (x, y + 1)

			countPaths(maze, x, y + 1, N, sol);

			// go left (x, y) --> (x, y - 1)

			countPaths(maze, x, y - 1, N, sol);
		}

		// backtrack from current cell and remove it from current path
		sol[x][y] = 0;

		return false;
	}

}
