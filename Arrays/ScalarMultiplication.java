package Arrays;

import java.util.Scanner;

public class ScalarMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		int col = sc.nextInt();
		int scalar = sc.nextInt();

		int m[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				m[i][j] = sc.nextInt();
		}

		int res[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				res[i][j] = m[i][j] * scalar;
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}

	}

}
