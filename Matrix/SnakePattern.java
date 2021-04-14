package Matrix;

public class SnakePattern {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		snake(a);
	}

	static int r = 4, c = 4;

	static void snake(int a[][]) {

		for (int i = 0; i < r; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < c; j++)
					System.out.print(a[i][j] + " ");
			} else {
				for (int j = c - 1; j >= 0; j--)
					System.out.print(a[i][j] + " ");
			}
		}

	}

}
