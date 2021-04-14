package Backtracking;

import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			char a[][] = new char[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = sc.next().charAt(0);
				}
			}
			String s = sc.next();
			System.out.println(exist(a, s));

		}
	}

	static boolean exist(char[][] board, String word) {
		int n = board.length;
		int m = board[0].length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				// if (board[i][j] == word.charAt(0)) {

//					boolean ansr = helper(board, i, j, word, 0, new boolean[n][m]);
//
//					if (ansr == true) {
//						return ansr;
//					}

				if (helper(board, i, j, word, 0, new boolean[n][m]))
					return true;
			}

		}
		// }

		return false;
	}

	static boolean helper(char[][] a, int row, int col, String word, int vIdx, boolean[][] visited) {
		if (vIdx == word.length()) {
			return true;
		}
		if (row < 0 || col < 0 || row >= a.length || col >= a.length || visited[row][col]
				|| word.charAt(vIdx) != a[row][col]) {
			return false;
		}
		visited[row][col] = true;

		boolean ans = helper(a, row + 1, col, word, vIdx + 1, visited)
					  || helper(a, row, col + 1, word, vIdx + 1, visited) 
					  || helper(a, row - 1, col, word, vIdx + 1, visited)
					  || helper(a, row, col - 1, word, vIdx + 1, visited);

		visited[row][col] = false;

		return ans;

	}

}
