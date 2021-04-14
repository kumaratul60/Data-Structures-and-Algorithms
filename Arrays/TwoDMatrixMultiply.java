package Arrays;

import java.util.Scanner;

public class TwoDMatrixMultiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		int col = sc.nextInt();

		int[] m[] = new int[row][col];
		int[] n[] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				m[i][j] = sc.nextInt();
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				n[i][j] = sc.nextInt();
		}
		int c[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				c[i][j] = m[i][j] + n[i][j];
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();

		}
		int d[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				for (int k = 0; k < col; k++)

					d[i][j] += m[i][k] * n[k][j];
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				System.out.print(d[i][j] + " ");
			System.out.println();

		}
		System.out.println();

	}

}
