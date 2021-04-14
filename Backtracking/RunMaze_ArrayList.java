package Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMaze_ArrayList {

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

			ArrayList<String> res = Solution.maze(a, n);
			if (res.size() > 0) {
				for (int i = 0; i < res.size(); i++)
					System.out.println(res.get(i) + " ");
				System.out.println();
			} else
				System.out.println(-1);

		}

	}
}

class Solution {

	static ArrayList<String> maze(int m[][], int n) {
		ArrayList<String> st = new ArrayList<>();
		backtrack(m, n, 0, 0, "", st);
		return st;

	}

	static void backtrack(int a[][], int n, int row, int col, String ans, ArrayList<String> st) {
		if (row < 0 || col < 0 || row >= n || col >= n || a[row][col] == 0)
			return;
		if (row == n - 1 && col == n - 1) {
			st.add(ans + "");
			return;
		}
		a[row][col] = 0;

		backtrack(a, n, row - 1, col, ans + "U", st);
		backtrack(a, n, row + 1, col, ans + "D", st);
		backtrack(a, n, row, col - 1, ans + "L", st);
		backtrack(a, n, row, col + 1, ans + "R", st);

		a[row][col] = 1; // backtracking

	}
	
 

}
