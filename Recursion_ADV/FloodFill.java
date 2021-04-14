package Recursion_ADV;

public class FloodFill {

	public static void main(String[] args) {

		int a[][] = { { 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0 }, { 1, 0, 0, 1, 1, 0, 1, 1 },
				{ 1, 2, 2, 2, 2, 0, 1, 0 }, { 1, 1, 1, 2, 2, 0, 1, 0 }, { 1, 1, 1, 2, 2, 2, 2, 0 },
				{ 1, 1, 1, 1, 1, 2, 1, 1 }, { 1, 1, 1, 1, 1, 2, 2, 1 }, };

//		int row = 4, col = 3, toFill = 3, prevFill = 2;
//		floodFill(a, row, col, toFill, prevFill);
		floodFill(a, 4, 3, 3, 2);
		printM(a);

	}

	static void floodFill(int a[][], int row, int col, int toFill, int prevFill) {
		int rows = a.length;
		int columns = a[0].length;

		if (row < 0 || row >= rows && col < 0 || col >= columns) {
			return;
		}
		if (a[row][col] != prevFill) {
			return;
		}

		a[row][col] = toFill;
		floodFill(a, row - 1, col, toFill, prevFill);
		floodFill(a, row, col - 1, toFill, prevFill);
		floodFill(a, row + 1, col, toFill, prevFill);
		floodFill(a, row, col + 1, toFill, prevFill);
	}

	static void printM(int[][] a) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.println(a[i][j] + " ");
				System.out.println();
			}
		}

	}

}
