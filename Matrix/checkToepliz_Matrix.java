package Matrix;

import java.util.Scanner;

public class checkToepliz_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					a[i][j] = sc.nextInt();
			System.out.println(checkToepliz(a));

		}
	}

	public static boolean checkToepliz(int[][] matrix) {
		for (int i = 0; i < matrix.length - 1; i++)
			for (int j = 0; j < matrix[0].length-1 ; j++)
				if (matrix[i][j] != matrix[i + 1][j + 1])
					return false;

		return true;
	}

}
