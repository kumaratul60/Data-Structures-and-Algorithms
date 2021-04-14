package Backtracking;

import java.util.Scanner;

public class RatMaz_sortestPath {

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

			int solArr[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					solArr[i][j] = 0;
				}
			}

			if (ratInMaze(arr, 0, 0, n, solArr)) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(solArr[i][j] + " ");
					}
					System.out.println();
				}
			}

//			if (ratInMaze(arr, 0, 0, n, solArr)) {
//				System.out.println("yes");
//
//			} else
//				System.out.println("no");
 
		}
	}

	static boolean isSafe(int maze[][], int x, int y, int n) {
		if (x < n && y < n && maze[x][y] == 1) {
			return true;
		}
		return false;
	}

	static boolean ratInMaze(int[] maze[], int x, int y, int n, int solMaze[][]) {

		if (x == n - 1 && y == n - 1) {
			solMaze[x][y] = 1;
			return true;
		}
		if (isSafe(maze, x, y, n)) {
			solMaze[x][y] = 1;

			if (ratInMaze(maze, x + 1, y, n, solMaze)) {
				return true;
			}
			if (ratInMaze(maze, x, y + 1, n, solMaze)) {
				return true;
			}
			solMaze[x][y] = 0; // backtrack
			return false;
		}

		return false;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// jump 2 step

	static boolean solveMaze(int maze[][], int n, int x, int y, int sol[][]) {
		if (x == n - 1 && y == n - 1) {
			sol[x][y] = 1;
			return true;
		}
		if (isSafe(maze, n, x, y)) {

			sol[x][y] = 1;

			for (int i = 1; i <= maze[x][y] && i < n; i++) {

				if (solveMaze(maze, n, x + 1, y, sol))
					return true;

				if (solveMaze(maze, n, x, y + 1, sol))
					return true;
			}

			sol[x][y] = 0; // backtrack
			return false;

		}

		return false;

	}

}
