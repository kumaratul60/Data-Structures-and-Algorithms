package Backtracking;

import java.util.Scanner;

public class SudokuSolver {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int a[][] = new int[n][m];
//		for (int i = 0; i < n; i++)
//			for (int j = 0; j < m; j++)
//				a[i][j] = sc.nextInt();
		int a[][] = { 
				{ 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 },
                };


		solveSudoku(a, 0, 0);
		display(a);

	}

	static void display(int[][] board) {
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
		System.out.println();

	}

	static void solveSudoku(int[][] board, int i, int j) {

		if (i == board.length) {
			display(board);
			return;
		}

		int next_i = 0;
		int next_j = 0;
		if (j == board[0].length - 1) {
			next_i = i + 1;
			next_j = 0;
		} else {
			next_i = 0;
			next_j = j + 1;
		}

		if (board[i][j] != 0) {
			solveSudoku(board, next_i, next_j);

		} else {
			for (int possibleOp = 1; possibleOp <= 9; possibleOp++) {

				if (isValid(board, i, j, possibleOp) == true) {

					board[i][j] = possibleOp;

					solveSudoku(board, next_i, next_j);

					board[i][j] = 0;

				}
			}
		}
	}

	static boolean isValid(int board[][], int row, int col, int value) {
		for (int j = 0; j < board[0].length; j++)
			if (board[row][j] == value)
				return false;

		for (int i = 0; i < board.length; i++)
			if (board[i][col] == value)
				return false;

		int subMatrix_i = row / 3 * 3;
		int subMatrix_j = col / 3 * 3;

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (board[subMatrix_i + i][subMatrix_j + j] == value)
					return true;

		return false;

	}

}
