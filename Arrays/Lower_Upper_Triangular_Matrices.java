package Arrays;

import java.util.Scanner;

public class Lower_Upper_Triangular_Matrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int m[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				m[i][j] = sc.nextInt();

		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i < j)
					System.out.print("0" + " ");
				else
					System.out.print(m[i][j] + " ");

			}
			System.out.println();
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i > j)
					System.out.print("0" + " ");
				else
					System.out.print(m[i][j] + " ");

			}
			System.out.println();

		}

	}

}
