package Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMaze {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					a[i][j] = sc.nextInt();

			ArrayList<String> res = png.path(a, n);
			if (res.size() > 0) {
				for (int i = 0; i < res.size(); i++)
					System.out.println(res.get(i) + " ");
				System.out.println();
			} else
				System.out.println(-1);

		}
	}

	static class png {

		public static ArrayList<String> path(int a[][], int n) {
			ArrayList<String> str = new ArrayList<>();
			boolean[][] visi = new boolean[n][n];
			maze(a, n, 0, 0, "", visi, str);
			return str;
		}

		static void maze(int a[][], int n, int row, int col, String ans, boolean[][] visited, ArrayList<String> str) {

			if (row < 0 || row >= n || col < 0 || col >= n || visited[row][col] || a[row][col] == 0)
				return;

			if (row == n - 1 && col == n - 1) {
				str.add(ans + " ");
				return;
			}
			visited[row][col] = true;

			maze(a, n, row - 1, col, ans + "U", visited, str);
			maze(a, n, row + 1, col, ans + "D", visited, str);
			maze(a, n, row, col - 1, ans + "L", visited, str);
			maze(a, n, row, col + 1, ans + "R", visited, str);

			visited[row][col] = false;

		}
	}

}
