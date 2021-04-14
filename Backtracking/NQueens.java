package Backtracking;

public class NQueens {

	public static void main(String[] args) {

		// (matrix[][],row,col,totalQueen,currently_palaced_queen,ans)
		nQueen(new boolean[4][4], 0, 0, 4, 0, "");

	}

	private static void nQueen(boolean[][] board, int row, int col, int tq, int op, String ans) {

		if (op == tq) {
			System.out.println(ans);
			return;
		}
		if (col == board[0].length) {
			row++;
			col = 0;
		}
		if (row == board.length) {
			return;
		}

		// place
		if (isItSafeToPlace(board, row, col)) {

			// do
			board[row][col] = true;

			// recurr
			nQueen(board, row, col + 1, tq, op + 1, ans + "[" + row + ";" + col + "]");

			// undo
			board[row][col] = false;
		}

		// not place
		nQueen(board, row, col + 1, tq, op, ans);

	}

	private static boolean isItSafeToPlace(boolean[][] board, int row, int col) {

		// vertically up
		int r = row - 1;
		int c = col;

		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}

		// horizontally left
		r = row;
		c = col - 1;
		while (c >= 0) {
			if (board[r][c]) {
				return false;
			}
			c--;
		}

		// diagonally left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}

		// diagonally right
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

}
